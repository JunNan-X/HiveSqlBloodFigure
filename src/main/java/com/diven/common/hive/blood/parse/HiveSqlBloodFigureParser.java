package com.diven.common.hive.blood.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.antlr.runtime.tree.Tree;

import com.diven.common.hive.blood.exception.SQLParseException;
import com.diven.common.hive.blood.exception.UnSupportedException;
import com.diven.common.hive.blood.model.Block;
import com.diven.common.hive.blood.model.ColLine;
import com.diven.common.hive.blood.model.QueryTree;
import com.diven.common.hive.blood.model.SQLResult;
import com.diven.common.hive.blood.utils.Check;
import com.diven.common.hive.blood.utils.MetaCache;
import com.diven.common.hive.blood.utils.NumberUtil;
import com.diven.common.hive.blood.utils.ParseUtil;
import com.diven.common.hive.ql.parse.ASTNode;
import com.diven.common.hive.ql.parse.BaseSemanticAnalyzer;
import com.diven.common.hive.ql.parse.HiveParser;
import com.diven.common.hive.ql.parse.ParseDriver;



/**
 * 	hive sql解析类
 * 	目的：实现HQL的语句解析，分析出输入输出表、字段和相应的处理条件。为字段级别的数据血缘提供基础。
 * 	重点：获取SELECT操作中的表和列的相关操作。其他操作这判断到字段级别。
 * 	实现思路：对AST深度优先遍历，遇到操作的token则判断当前的操作，遇到子句则压栈当前处理，处理子句。子句处理完，栈弹出。
 * 	处理字句的过程中，遇到子查询就保存当前子查询的信息，判断与其父查询的关系，最终形成树形结构；
 * 	遇到字段或者条件处理则记录当前的字段和条件信息、组成Block，嵌套调用。 
 * 	关键点解析 
 * 		   1、遇到TOK_TAB或TOK_TABREF则判断出当前操作的表
 *         2、压栈判断是否是join，判断join条件
 *         3、定义数据结构Block,遇到在where\select\join时获得其下相应的字段和条件，组成Block
 *         4、定义数据结构ColLine,遇到TOK_SUBQUERY保存当前的子查询信息，供父查询使用
 *         5、定义数据结构ColLine,遇到TOK_UNION结束时，合并并截断当前的列信息
 *         6、遇到select *　或者未明确指出的字段，查询元数据进行辅助分析
 *         7、解析结果进行相关校验
 *  试用范围：
 * 1、支持标准SQL 
 * 2、不支持transform using script
 * @author divenwu     
 */
public class HiveSqlBloodFigureParser {
	
	private static final String SPLIT_DOT = ".";
	private static final String SPLIT_COMMA = ",";
	private static final String SPLIT_AND = "&";
	private static final String TOK_EOF = "<EOF>";
	private static final String CON_WHERE = "WHERE:";
	private static final String TOK_TMP_FILE = "TOK_TMP_FILE";
	
	/**变量替换正则*/
	private static final String regex_replace_params = "\\$\\{.*?\\}|\\$[a-zA-Z_]+[a-z-A-Z_0-9]+";
	/**排除列替换正则*/
	private static final String regex_replace_exclude = "`\\(.*?\\).+?`";
	
    private Map<String /*table*/, List<String/*column*/>> dbMap = new HashMap<String, List<String>>();
    private List<QueryTree> queryTreeList = new ArrayList<QueryTree>(); //子查询树形关系保存
    
    private Stack<Set<String>> conditionsStack = new Stack<Set<String>>();
    private Stack<List<ColLine>> colsStack = new Stack<List<ColLine>>();
    
    private Map<String, List<ColLine>> resultQueryMap = new HashMap<String,  List<ColLine>>();
	private Set<String> conditions = new HashSet<String>(); //where or join 条件缓存
	private List<ColLine> cols = new ArrayList<ColLine>(); //一个子查询内的列缓存
	
	private Stack<String> tableNameStack = new Stack<String>();
    private Stack<Boolean> joinStack = new Stack<Boolean>();
    private Stack<ASTNode> joinOnStack = new Stack<ASTNode>();
    
    private Map<String, QueryTree> queryMap = new HashMap<String, QueryTree>();
    private boolean joinClause = false;
    private ASTNode joinOn = null;
    private String nowQueryDB = "default"; //hive的默认库
    private boolean isCreateTable = false;
    
    private String currentSql;
    
    //结果
    private List<SQLResult> resultList = new ArrayList<SQLResult>();
    private List<ColLine> colLines = new ArrayList<ColLine>();  
    private Set<String> outputTables = new HashSet<String>();
    private Set<String> inputTables = new HashSet<String>();
    
    public HiveSqlBloodFigureParser() {}
    
    private void parseIteral(ASTNode ast) {
        prepareToParseCurrentNodeAndChilds(ast);
        parseChildNodes(ast);
        parseCurrentNode(ast);
        endParseCurrentNode(ast);
    }
    
    /**
	 * 清洗sql中的参数，防止解析sql时，应为参数而报错。
	 * @param sql	清洗的sql
	 * @return	转换后的sql
	 */
	private String convertSqlVariable(String sql) {
		if(sql != null) {
			//替换参数
			sql = sql.replaceAll(regex_replace_params, "1024");
			//替换排除列：select `(name|id|pwd)?+.+` from table
			sql = sql.replaceAll(regex_replace_exclude, "1024");
			//替换 “ ` ”
			sql = sql.trim().replace("`", "");
		}
		return sql;
	}

	/**
	 * 解析当前节点
	 * 
	 * @param ast
	 * @param set
	 * @return
	 */
    private void parseCurrentNode(ASTNode ast){
        if (ast.getToken() != null) {
            switch (ast.getToken().getType()) {
		    case HiveParser.TOK_CREATETABLE: //outputtable
		    	isCreateTable = true;
		    	String tableOut = fillDB(BaseSemanticAnalyzer.getUnescapedName((ASTNode) ast.getChild(0)));
		    	outputTables.add(tableOut);
		    	break;
            case HiveParser.TOK_TAB:// outputTable
                String tableTab = BaseSemanticAnalyzer.getUnescapedName((ASTNode) ast.getChild(0));
                String tableOut2 = fillDB(tableTab);
                outputTables.add(tableOut2);
                break;
            case HiveParser.TOK_TABREF:// inputTable
                ASTNode tabTree = (ASTNode) ast.getChild(0);
                String tableInFull = fillDB((tabTree.getChildCount() == 1) ?  
                		BaseSemanticAnalyzer.getUnescapedName((ASTNode) tabTree.getChild(0))
                		: BaseSemanticAnalyzer.getUnescapedName((ASTNode) tabTree.getChild(0))
                        + SPLIT_DOT + BaseSemanticAnalyzer.getUnescapedName((ASTNode) tabTree.getChild(1))
                		);
                String tableIn = tableInFull.substring(tableInFull.indexOf(SPLIT_DOT) + 1);	
                inputTables.add(tableInFull);
                queryMap.clear();
                String alia = null;
                if (ast.getChild(1) != null) { //(TOK_TABREF (TOK_TABNAME detail usersequence_client) c) 
                    alia = ast.getChild(1).getText().toLowerCase();
                    QueryTree qt = new QueryTree();
                    qt.setCurrent(alia);
                    qt.getTableSet().add(tableInFull);
                    QueryTree pTree = getSubQueryParent(ast);
                    qt.setpId(pTree.getpId());
                    qt.setParent(pTree.getParent());
                    queryTreeList.add(qt);
                    if (joinClause && ast.getParent() == joinOn) { // TOK_SUBQUERY join TOK_TABREF ,此处的TOK_SUBQUERY信息不应该清楚
                        for (QueryTree entry : queryTreeList) { //当前的查询范围
    						if (qt.getParent().equals(entry.getParent())) {
    							queryMap.put(entry.getCurrent(), entry);
    						}
    					}
					} else {
						queryMap.put(qt.getCurrent(), qt);
					}
                } else {
                	alia = tableIn.toLowerCase();
                	QueryTree qt = new QueryTree();
                    qt.setCurrent(alia);
                    qt.getTableSet().add(tableInFull);
                    QueryTree pTree = getSubQueryParent(ast);
                    qt.setpId(pTree.getpId());
                    qt.setParent(pTree.getParent());
                    queryTreeList.add(qt);
                    
                    if (joinClause && ast.getParent() == joinOn) {
	                    for (QueryTree entry : queryTreeList) {
							if (qt.getParent().equals(entry.getParent())) {
								queryMap.put(entry.getCurrent(), entry);
							}
	                    }
                    } else {
						queryMap.put(qt.getCurrent(), qt);
						//此处检查查询 select app.t1.c1,t1.c1 from t1 的情况
						queryMap.put(tableInFull.toLowerCase(), qt);
					}
                }
                break;
            case HiveParser.TOK_SUBQUERY: 
                if (ast.getChildCount() == 2) {
                    String tableAlias = BaseSemanticAnalyzer.unescapeIdentifier(ast.getChild(1).getText());
                    String aliaReal = "";
                    if(aliaReal.length() !=0){
                        aliaReal = aliaReal.substring(0, aliaReal.length()-1);
                    }
                    
                    QueryTree qt = new QueryTree();
                    qt.setCurrent(tableAlias.toLowerCase());
                    qt.setColLineList(generateColLineList(cols, conditions));
                    QueryTree pTree = getSubQueryParent(ast);
                    qt.setId(generateTreeId(ast));
                    qt.setpId(pTree.getpId()); 
                    qt.setParent(pTree.getParent());
                    qt.setChildList(getSubQueryChilds(qt.getId()));
                    if (Check.notEmpty(qt.getChildList())) {
                        for (QueryTree cqt : qt.getChildList()) {
                        	qt.getTableSet().addAll(cqt.getTableSet());
                        	queryTreeList.remove(cqt);  // 移除子节点信息
    					}
					}
                    queryTreeList.add(qt);
                    cols.clear();
                    
                    queryMap.clear();
                    for (QueryTree _qt : queryTreeList) {
                    	if (qt.getParent().equals( _qt.getParent())) { //当前子查询才保存
                    		queryMap.put(_qt.getCurrent(), _qt);
						}
    				}
                }
                break;
            case HiveParser.TOK_SELEXPR: //输入输出字段的处理
            	//解析需要插入的表
            	Tree tok_insert = ast.getParent().getParent();
            	Tree child = tok_insert.getChild(0).getChild(0); 
            	String tName = BaseSemanticAnalyzer.getUnescapedName((ASTNode) child.getChild(0));
            	String destTable = TOK_TMP_FILE.equals(tName) ? TOK_TMP_FILE : fillDB(tName); 
            	
            	//select a.*,* from t1 和 select * from (select c1 as a,c2 from t1) t 的情况
            	if (ast.getChild(0).getType() == HiveParser.TOK_ALLCOLREF) { 
            		String tableOrAlias = "";
            		if (ast.getChild(0).getChild(0) != null) {
            			tableOrAlias = ast.getChild(0).getChild(0).getChild(0).getText();
					}
            		String[] result = getTableAndAlia(tableOrAlias);
            		String _alia = result[1];
            		
            		boolean isSub = false;  //处理嵌套select * 的情况
            		if (Check.notEmpty(_alia)) {
            			for (String string : _alia.split(SPLIT_AND)) { //迭代循环的时候查询
                			QueryTree qt = queryMap.get(string.toLowerCase());
                			if (null != qt) {
                				List<ColLine> colLineList = qt.getColLineList();
                				if (Check.notEmpty(colLineList)) {
                					isSub = true;
                					for (ColLine colLine : colLineList) {
                    					cols.add(colLine);	
        							}
								}
                			}
                		}
					}
            		if (!isSub) { //处理直接select * 的情况
            			String nowTable =  result[0];
                		String[] tableArr = nowTable.split(SPLIT_AND); //fact.test&test2
                		for (String tables : tableArr) {
            				String[] split = tables.split("\\.");
                    		if (split.length > 2) {
        						throw new SQLParseException("parse table:" + nowTable);
        					}
        					List<String> colByTab =  MetaCache.getInstance().getColumnByDBAndTable(tables);
        					for (String column : colByTab) {
        						Set<String> fromNameSet = new LinkedHashSet<String>();
        						fromNameSet.add(tables + SPLIT_DOT + column);
        						ColLine cl = new ColLine(column, tables + SPLIT_DOT + column, fromNameSet,
        								new LinkedHashSet<String>() , destTable, column);
        						cols.add(cl);	
        					}
    					}
					}
				} else {
	            	Block bk = getBlockIteral((ASTNode)ast.getChild(0));
	                String toNameParse = getToNameParse(ast, bk);
	                Set<String> fromNameSet  = filterData(bk.getColSet());
	            	ColLine cl = new ColLine(toNameParse, bk.getCondition(), fromNameSet, new LinkedHashSet<String>() , destTable, "");
	            	cols.add(cl);
				}
                break;
            case HiveParser.TOK_WHERE: //3、过滤条件的处理select类
        		conditions.add(CON_WHERE + getBlockIteral((ASTNode) ast.getChild(0)).getCondition());
                break; 
            default:
            	 //1、过滤条件的处理join类
            	if (joinOn != null && joinOn.getTokenStartIndex() == ast.getTokenStartIndex()
            			&& joinOn.getTokenStopIndex() == ast.getTokenStopIndex()) {
            		ASTNode astCon = (ASTNode)ast.getChild(2);
            		conditions.add(ast.getText().substring(4) + ":" + getBlockIteral(astCon).getCondition());
                    break;  
            	}
            }
        }
    }
    
    /**
     *	 查找当前节点的父子查询节点
     * @param ast
     */
    private QueryTree getSubQueryParent(Tree ast) {
    	Tree _tree = ast;
    	QueryTree qt = new QueryTree();
    	while(!(_tree = _tree.getParent()).isNil()){
    		if(_tree.getType() == HiveParser.TOK_SUBQUERY){
    			qt.setpId(generateTreeId(_tree));
    			qt.setParent(BaseSemanticAnalyzer.getUnescapedName((ASTNode)_tree.getChild(1)));
    			return qt;
    		}
    	}
    	qt.setpId(-1);
    	qt.setParent("NIL");
		return qt; 
	}
	private int generateTreeId(Tree tree) {
		return tree.getTokenStartIndex() + tree.getTokenStopIndex();
	}
    
    
    /**
     *	查找当前节点的子子查询节点（索引）
     * @param ast
     */
    private List<QueryTree> getSubQueryChilds(int id) {
    	List<QueryTree> list = new ArrayList<QueryTree>();
    	for (int i = 0; i < queryTreeList.size(); i++) {
			QueryTree qt = queryTreeList.get(i);
    		if (id == qt.getpId()) {
    			list.add(qt);
			}
		}
    	return list;
	}
    
	/**
     * 	获得要解析的名称
     * @param ast
     * @param bk
     * @return
     */
	private String getToNameParse(ASTNode ast, Block bk) {
		String alia = "";
		Tree child = ast.getChild(0);
		if (ast.getChild(1) != null) { //有别名 ip as alia
			alia = ast.getChild(1).getText();
		} else if (child.getType() == HiveParser.DOT //没有别名 a.ip 
				&& child.getChild(0).getType() == HiveParser.TOK_TABLE_OR_COL
		        && child.getChild(0).getChildCount() == 1
		        && child.getChild(1).getType() == HiveParser.Identifier) {
			alia = BaseSemanticAnalyzer.unescapeIdentifier(child.getChild(1).getText());
		} else if (child.getType() == HiveParser.TOK_TABLE_OR_COL //没有别名 ip
				 	&& child.getChildCount() == 1
			        && child.getChild(0).getType() == HiveParser.Identifier) { 
			alia = BaseSemanticAnalyzer.unescapeIdentifier(child.getChild(0).getText());
		}
		return alia;
	}
    
	/**
	 * 获得解析的块，主要应用在WHERE、JOIN和SELECT端
	 * 如： <p>where a=1
	 * <p>t1 join t2 on t1.col1=t2.col1 and t1.col2=123
	 * <p>select count(distinct col1) from t1
	 * @param ast
	 * @return
	 */
	private Block getBlockIteral(ASTNode ast) {
		if (ast.getType() == HiveParser.KW_OR
			||ast.getType() == HiveParser.KW_AND) {
			Block bk1 = getBlockIteral((ASTNode)ast.getChild(0));
			Block bk2 = getBlockIteral((ASTNode)ast.getChild(1));
			bk1.getColSet().addAll(bk2.getColSet());
			bk1.setCondition("(" +  bk1.getCondition() + " " + ast.getText() + " " + bk2.getCondition() + ")");
			return bk1;
		} else if (ast.getType() == HiveParser.NOTEQUAL //判断条件  > < like in 
			|| ast.getType() == HiveParser.EQUAL
			|| ast.getType() == HiveParser.LESSTHAN
			|| ast.getType() == HiveParser.LESSTHANOREQUALTO
			|| ast.getType() == HiveParser.GREATERTHAN
			|| ast.getType() == HiveParser.GREATERTHANOREQUALTO
			|| ast.getType() == HiveParser.KW_LIKE
			|| ast.getType() == HiveParser.DIVIDE
			|| ast.getType() == HiveParser.PLUS
			|| ast.getType() == HiveParser.MINUS
			|| ast.getType() == HiveParser.STAR
			|| ast.getType() == HiveParser.MOD
			|| ast.getType() == HiveParser.AMPERSAND
			|| ast.getType() == HiveParser.TILDE
			|| ast.getType() == HiveParser.BITWISEOR
			|| ast.getType() == HiveParser.BITWISEXOR) {
			Block bk1 = getBlockIteral((ASTNode)ast.getChild(0));
			if (ast.getChild(1) == null) { // -1
				bk1.setCondition(ast.getText() + bk1.getCondition());
			} else {
				Block bk2 = getBlockIteral((ASTNode)ast.getChild(1));
				bk1.getColSet().addAll(bk2.getColSet());
				bk1.setCondition(bk1.getCondition() + " " + ast.getText() + " " + bk2.getCondition());
			}
			return bk1;
		} else if (ast.getType() == HiveParser.TOK_FUNCTIONDI) {
			Block col = getBlockIteral((ASTNode) ast.getChild(1));
			String condition = ast.getChild(0).getText();
			col.setCondition(condition + "(distinct (" + col.getCondition() +"))");
        	return col;
		} else if (ast.getType() == HiveParser.TOK_FUNCTION){
    		String fun = ast.getChild(0).getText(); 
    		Block col = ast.getChild(1) == null ? new Block() : getBlockIteral((ASTNode) ast.getChild(1));
    		if ("when".equalsIgnoreCase(fun)) {
    			col.setCondition(getWhenCondition(ast));
    			Set<Block> processChilds = processChilds(ast, 1);
    			col.getColSet().addAll(bkToCols(col, processChilds));
    			return col; 
			} else if("IN".equalsIgnoreCase(fun)) {
				col.setCondition(col.getCondition() + " in (" + blockCondToString(processChilds(ast, 2)) + ")");
				return col;
			} else if("TOK_ISNOTNULL".equalsIgnoreCase(fun) //isnull isnotnull
					|| "TOK_ISNULL".equalsIgnoreCase(fun)){
				col.setCondition(col.getCondition() + " " + fun.toLowerCase().substring(4));
				return col;	
			} else if("BETWEEN".equalsIgnoreCase(fun)){
				col.setCondition(getBlockIteral((ASTNode) ast.getChild(2)).getCondition() 
						+ " between " + getBlockIteral((ASTNode) ast.getChild(3)).getCondition() 
						+ " and " + getBlockIteral((ASTNode) ast.getChild(4)).getCondition());
				return col;
			}
    		Set<Block> processChilds = processChilds(ast, 1);
    		col.getColSet().addAll(bkToCols(col, processChilds));
    		col.setCondition(fun +"("+ blockCondToString(processChilds) + ")");
        	return col;
    	} else if(ast.getType() == HiveParser.LSQUARE){ //map,array
    		    Block column = getBlockIteral((ASTNode) ast.getChild(0));
    		    Block key = getBlockIteral((ASTNode) ast.getChild(1));
    		    column.setCondition(column.getCondition() +"["+ key.getCondition() + "]");
            	return column;
        } else {
    		return parseBlock(ast); 
    	}
	}
	
	
	private Set<String> bkToCols(Block col, Set<Block> processChilds) {
		Set<String> set = new LinkedHashSet<String>(processChilds.size());
		for (Block colLine : processChilds) {
			if (Check.notEmpty(colLine.getColSet())) {
				set.addAll(colLine.getColSet());
			}
		}
		return set;
	}
	
	private String blockCondToString(Set<Block> processChilds) {
		StringBuilder sb = new StringBuilder();
		for (Block colLine : processChilds) {
			sb.append(colLine.getCondition()).append(SPLIT_COMMA);
		}
		if (sb.length()>0) {
			sb.setLength(sb.length()-1);
		}
		return sb.toString();
	}
	
	/**
	 *	  解析when条件 
	 * @param ast
	 * @return case when c1>100 then col1 when c1>0 col2 else col3 end
	 */
	private String getWhenCondition(ASTNode ast) {
		int cnt = ast.getChildCount();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < cnt; i++) {
			String condition = getBlockIteral((ASTNode)ast.getChild(i)).getCondition();
			if (i == 1) {
				sb.append("(case when " + condition);
			} else if (i == cnt-1) { //else
				sb.append(" else " + condition + " end)");
			} else if (i % 2 == 0){ //then
				sb.append(" then " + condition);
			} else {
				sb.append(" when " + condition);
			}
		}
		return sb.toString();
	}
	
	
	/**
	 *	 保存subQuery查询别名和字段信息
	 * @param sqlIndex
	 * @param tableAlias
	 */
	private void putResultQueryMap(int sqlIndex, String tableAlias) {
		List<ColLine> list = generateColLineList(cols, conditions);
		String key = sqlIndex == 0 ? tableAlias : tableAlias + sqlIndex; //没有重名的情况就不用标记
		resultQueryMap.put(key, list);
	}
	
	private List<ColLine> generateColLineList(List<ColLine> cols, Set<String> conditions) {
		List<ColLine> list = new ArrayList<ColLine>();
		for (ColLine entry : cols) {
			entry.getConditionSet().addAll(conditions);
			list.add(ParseUtil.cloneColLine(entry));
		}
		return list;
	}
	
	/**
	 * 判断正常列，
	 * 正常：a as col, a
	 * 异常：1 ，'a' //数字、字符等作为列名
	 */
	private boolean notNormalCol(String column) {
		return Check.isEmpty(column) || NumberUtil.isNumeric(column) 
				|| (column.startsWith("\"") && column.endsWith("\"")) 
				|| (column.startsWith("\'") && column.endsWith("\'"));
	}
    
    /**
     * 从指定索引位置开始解析子树
     * @param ast
     * @param startIndex 开始索引
     * @param isSimple 是否简写
     * @param withCond 是否包含条件
     * @return
     */
	private Set<Block> processChilds(ASTNode ast,int startIndex) {
		int cnt = ast.getChildCount();
		Set<Block> set = new LinkedHashSet<Block>();
		for (int i = startIndex; i < cnt; i++) {
			Block bk = getBlockIteral((ASTNode) ast.getChild(i));
			if (Check.notEmpty(bk.getCondition()) || Check.notEmpty(bk.getColSet())){
				set.add(bk);
			}
		}
		return set;
	}	
	
   
	/**
	 * 解析获得列名或者字符数字等和条件
	 * @param ast
	 * @param isSimple
	 * @return
	 */
	private Block parseBlock(ASTNode ast) {
		if (ast.getType() == HiveParser.DOT
				&& ast.getChild(0).getType() == HiveParser.TOK_TABLE_OR_COL
		        && ast.getChild(0).getChildCount() == 1
		        && ast.getChild(1).getType() == HiveParser.Identifier) {
		    String column = BaseSemanticAnalyzer.unescapeIdentifier(ast.getChild(1).getText());
		    String alia = BaseSemanticAnalyzer.unescapeIdentifier(ast.getChild(0).getChild(0).getText());
		    return getBlock(column, alia);
		} else if (ast.getType() == HiveParser.TOK_TABLE_OR_COL 
				 	&& ast.getChildCount() == 1
			        && ast.getChild(0).getType() == HiveParser.Identifier) { 
			String column = ast.getChild(0).getText();
			return getBlock(column, null);
		} else if (ast.getType() == HiveParser.Number 
				|| ast.getType() == HiveParser.StringLiteral 
				|| ast.getType() == HiveParser.Identifier) {
			Block bk = new Block();
			bk.setCondition(ast.getText());
			bk.getColSet().add(ast.getText());
			return bk;
		}
		return new Block();
	}
	
	
	/**
	 * 根据列名和别名获得块信息
	 * @param column
	 * @param alia
	 * @param tree 当前子查询下的别名可以使用
	 * @return
	 */
	private Block getBlock(String column, String alia) {
		String[] result = getTableAndAlia(alia);
		String tableArray = result[0];
		String _alia = result[1];
		
		for (String string : _alia.split(SPLIT_AND)) { //迭代循环的时候查询
			QueryTree qt = queryMap.get(string.toLowerCase());
			if (Check.notEmpty(column)) {
				for (ColLine colLine : qt.getColLineList()) {
					if (column.equalsIgnoreCase(colLine.getToNameParse())) {
						Block bk = new Block();
						bk.setCondition(colLine.getColCondition());
						bk.setColSet(ParseUtil.cloneSet(colLine.getFromNameSet()));	
						return bk;
					}
				}
			}
		}

		String _realTable = tableArray;
		int cnt = 0; //匹配字段和元数据字段相同数目，如果有多个匹配，即此sql有二义性
		for (String tables : tableArray.split(SPLIT_AND)) { //初始化的时候查询数据库对应表
			String[] split = tables.split("\\.");
    		if (split.length > 2) {
				throw new SQLParseException("parse table:" + tables);
			}
			List<String> colByTab =  MetaCache.getInstance().getColumnByDBAndTable(tables);
			for (String col : colByTab) {
				if (column.equalsIgnoreCase(col)) {
					_realTable = tables;
					cnt++;
				}
			}
		}
		if (cnt > 1) { //二义性检查
			throw new SQLParseException("SQL is ambiguity, column: " + column + " tables:" + tableArray);
		}
		
		Block bk = new Block();
		bk.setCondition(_realTable + SPLIT_DOT + column);
		bk.getColSet().add(_realTable + SPLIT_DOT + column);
		return bk;
	}
	
	/**
	 * 	过滤掉无用的列：如col1,123,'2013',col2 ==>> col1,col2
	 * @param col
	 * @return
	 */
	private Set<String> filterData(Set<String> colSet){
		Set<String> set  = new LinkedHashSet<String>();
		for (String string : colSet) {
			if (!notNormalCol(string)) {
				set.add(string);
			}
		}
		return set;
	}
	
	
	/**
	 * 	解析所有子节点
	 * @param ast
	 * @return
	 */
    private void parseChildNodes(ASTNode ast){
        int numCh = ast.getChildCount();
        if (numCh > 0) {
            for (int num = 0; num < numCh; num++) {
                ASTNode child = (ASTNode) ast.getChild(num);
                parseIteral(child);
            }
        }
    }
    
    /**
     * 	准备解析当前节点
     * @param ast
     */
    private void prepareToParseCurrentNodeAndChilds(ASTNode ast){
        if (ast.getToken() != null) {
            switch (ast.getToken().getType()) {
            	case HiveParser.TOK_SWITCHDATABASE:
            	    nowQueryDB = ast.getChild(0).getText();
            	    break;
            	case HiveParser.TOK_TRANSFORM:
            		throw new UnSupportedException("no support transform using clause");
                case HiveParser.TOK_RIGHTOUTERJOIN:
                case HiveParser.TOK_LEFTOUTERJOIN:
                case HiveParser.TOK_JOIN:
                case HiveParser.TOK_LEFTSEMIJOIN:
        		case HiveParser.TOK_MAPJOIN:
        		case HiveParser.TOK_FULLOUTERJOIN:
        		case HiveParser.TOK_UNIQUEJOIN:
                	joinStack.push(joinClause);
                	joinClause = true;
                	joinOnStack.push(joinOn);
                	joinOn = ast;
                    break;
            }
        }
    }
    
    
	/**
     * 	结束解析当前节点
     * @param ast
     */
    private void endParseCurrentNode(ASTNode ast){
        if (ast.getToken() != null) {
        	Tree parent = ast.getParent();
            switch (ast.getToken().getType()) { //join 从句结束，跳出join
            case HiveParser.TOK_RIGHTOUTERJOIN:
            case HiveParser.TOK_LEFTOUTERJOIN:
            case HiveParser.TOK_JOIN:
            case HiveParser.TOK_LEFTSEMIJOIN:
    		case HiveParser.TOK_MAPJOIN:
    		case HiveParser.TOK_FULLOUTERJOIN:
    		case HiveParser.TOK_UNIQUEJOIN:
            	joinClause = joinStack.pop();
            	joinOn = joinOnStack.pop();
                break;

            case HiveParser.TOK_QUERY:
            	processUnionStack(ast, parent); //union的子节点
            case HiveParser.TOK_INSERT:
            case HiveParser.TOK_SELECT:
                break;
            case HiveParser.TOK_UNION:  //合并union字段信息
            	mergeUnionCols();
    			processUnionStack(ast, parent); //union的子节点
            	break;
            }
        }
    }
    
	private void mergeUnionCols() {
		validateUnion(cols);
		int size = cols.size();
		int colNum = size / 2;
		List<ColLine> list = new ArrayList<ColLine>(colNum);
		for (int i = 0; i < colNum; i++) { //合并字段
			ColLine col = cols.get(i);
			for (int j = i + colNum; j < size; j = j + colNum) {
				ColLine col2 = cols.get(j);
				list.add(col2);
				if (notNormalCol(col.getToNameParse()) && !notNormalCol(col2.getToNameParse())) {
					col.setToNameParse(col2.getToNameParse());
				}
				col.getFromNameSet().addAll(col2.getFromNameSet());
				
				col.setColCondition(col.getColCondition() + SPLIT_AND + col2.getColCondition());
				
				Set<String> conditionSet = ParseUtil.cloneSet(col.getConditionSet());
				conditionSet.addAll(col2.getConditionSet());
				conditionSet.addAll(conditions);
				col.getConditionSet().addAll(conditionSet);
			}
		}
		cols.removeAll(list); //移除已经合并的数据
	}
	
	private void processUnionStack(ASTNode ast, Tree parent) {
		boolean isNeedAdd = parent.getType() == HiveParser.TOK_UNION;
		if (isNeedAdd) {
			if (parent.getChild(0) == ast && parent.getChild(1) != null) {//有弟节点(是第一节点)
				//压栈
		    	conditionsStack.push(ParseUtil.cloneSet(conditions));
		    	conditions.clear();
		    	colsStack.push(ParseUtil.cloneList(cols));
		    	cols.clear();
			} else {  //无弟节点(是第二节点)
				 //出栈
				if (!conditionsStack.isEmpty()) {
					conditions.addAll(conditionsStack.pop());
				}
				if (!colsStack.isEmpty()) {
					cols.addAll(0, colsStack.pop());
				}
			}
		}
	}
    
    private void parseAST(ASTNode ast) {
        parseIteral(ast);
    }
    
    public List<SQLResult> parse(String sqlAll) throws Exception{
    	if (Check.isEmpty(sqlAll)) {
    		return resultList;
		}
    	startParseAll(); //清空最终结果集
		int i = 0; //当前是第几个sql
       	for (String sql : sqlAll.split("(?<!\\\\);")) {
       	        ParseDriver pd = new ParseDriver();
				String trim = sql.toLowerCase().trim();
				if (trim.startsWith("set") || trim.startsWith("add") || Check.isEmpty(trim)) {
					continue;
				}
				ASTNode ast = pd.parse(convertSqlVariable(sql));
				prepareParse();
				this.currentSql = sql;
    	        parseAST(ast);
    	        endParse(++i);
   	     }
       	return resultList;
    }
    
    /**
     *	 清空上次处理的结果
     */
	private void startParseAll() {
		resultList.clear();
	}
    
	private void prepareParse() {
		this.currentSql = null;
		isCreateTable = false;
	    dbMap.clear();
	    
		colLines.clear();
    	outputTables.clear();
    	inputTables.clear();
	    
	    queryMap.clear();
	    queryTreeList.clear();
	    
		conditionsStack.clear(); //where or join 条件缓存
		colsStack.clear(); //一个子查询内的列缓存
	    
	    resultQueryMap.clear();
		conditions.clear(); //where or join 条件缓存
		cols.clear(); //一个子查询内的列缓存

		tableNameStack.clear();
	    joinStack.clear();
	    joinOnStack.clear();
	    
	    joinClause = false;
	    joinOn = null;
	}
	
	/**
     * 	所有解析完毕之后的后期处理
     */
    private void endParse(int sqlIndex) {
    	putResultQueryMap(sqlIndex, TOK_EOF); 
    	putDBMap();
    	setColLineList();
	}
    
    /***
     * 	设置输出表的字段对应关系
     */
	private void setColLineList() {
		Map<String, List<ColLine>> map = new HashMap<String, List<ColLine>>();
		for (Entry<String, List<ColLine>> entry : resultQueryMap.entrySet()) {
			if (entry.getKey().startsWith(TOK_EOF)) {
				List<ColLine> value = entry.getValue();
				for (ColLine colLine : value) {
					List<ColLine> list = map.get(colLine.getToTable());
					if (Check.isEmpty(list)) {
						list = new ArrayList<ColLine>();
						map.put(colLine.getToTable(), list);
					}
					list.add(colLine);
				}
			}
		}
		
		for (Entry<String, List<ColLine>> entry : map.entrySet()) {
			String table = entry.getKey();
			List<ColLine> pList = entry.getValue();
			List<String> dList = dbMap.get(table);
			int metaSize = Check.isEmpty(dList) ? 0 : dList.size();
			for (int i = 0; i < pList.size(); i++) { //按顺序插入对应的字段
				ColLine clp = pList.get(i);
				String colName = null;
				if (i < metaSize) { 
					colName = table + SPLIT_DOT + dList.get(i); 
				} 
				if (isCreateTable && TOK_TMP_FILE.equals(table)) {
					for (String string : outputTables) {
						table = string;
					}
				}
				ColLine colLine = new ColLine(clp.getToNameParse(), clp.getColCondition(),
						clp.getFromNameSet(), clp.getConditionSet(), table, colName);
				colLines.add(colLine);
			}
		}
		
		//获取结果
		if (Check.notEmpty(colLines) || Check.notEmpty(inputTables) || Check.notEmpty(outputTables)) {
			SQLResult sr = new SQLResult();
			sr.setCurrentSql(this.currentSql);
			sr.setColLineList(ParseUtil.cloneList(colLines));
			sr.setInputTables(ParseUtil.cloneSet(inputTables));
			sr.setOutputTables(ParseUtil.cloneSet(outputTables));
			resultList.add(sr);
		}
	}
	
	
	private void putDBMap() {
    	for (String table : outputTables) {
    		List<String> list =  MetaCache.getInstance().getColumnByDBAndTable(table);
    		dbMap.put(table, list);
		}
	}
    
    /**
     * 	补全db信息
     * table1 ==>> db1.table1
     * db1.table1 ==>> db1.table1
     * db2.t1&t2 ==>> db2.t1&db1.t2
     * @param tables
     */
    private String fillDB(String nowTable) {
    	if (Check.isEmpty(nowTable)) {
			return nowTable;
		}
    	StringBuilder sb = new StringBuilder();
    	String[] tableArr = nowTable.split(SPLIT_AND); //fact.test&test2&test3
		for (String tables : tableArr) {
			String[] split = tables.split("\\" + SPLIT_DOT);
    		if (split.length > 2) {
				throw new SQLParseException("parse table:" + nowTable);
			}
    		String db = split.length == 2 ? split[0] : nowQueryDB ;
    		String table = split.length == 2 ? split[1] : split[0] ;
    		sb.append(db).append(SPLIT_DOT).append(table).append(SPLIT_AND);
		}
		if (sb.length()>0) {
			sb.setLength(sb.length()-1);
		}
		return sb.toString();
	}
    
	
	/**
	 * 	根据别名查询表明
	 * @param alia
	 * @return
	 */
	private String[] getTableAndAlia(String alia) {
		String _alia = Check.notEmpty(alia) ? alia  : 
				ParseUtil.collectionToString(queryMap.keySet(), SPLIT_AND, true) ;
		String[] result = {"" , _alia};
		Set<String> tableSet = new HashSet<String>();
		if (Check.notEmpty(_alia)) { 
			String[] split = _alia.split(SPLIT_AND);
			for (String string : split) {
				//别名又分单独起的别名 和 表名，即 select a.col,table_name.col from table_name a 
				if (inputTables.contains(string) || inputTables.contains(fillDB(string))) {
					tableSet.add(fillDB(string));
				} else if (queryMap.containsKey(string.toLowerCase())) {
					tableSet.addAll(queryMap.get(string.toLowerCase()).getTableSet());
				}
			}
			result[0] = ParseUtil.collectionToString(tableSet, SPLIT_AND, true);
			result[1] = _alia;
		} 
		return result;
	}
	
	/**
	 *	 校验union
	 * @param list
	 */
	private void validateUnion(List<ColLine> list){
    	int size = list.size();
    	if (size % 2 == 1) {
			throw new SQLParseException("union column number are different, size=" + size);
		}
		int colNum = size / 2;
		checkUnion(list, 0, colNum);
		checkUnion(list, colNum, size);
	}

	private void checkUnion(List<ColLine> list, int start, int end) {
		String tmp = null;
		for (int i = start; i < end; i++) { //合并字段
			ColLine col = list.get(i);
			if (Check.isEmpty(tmp)) {
				tmp = col.getToTable();
			} else if (!tmp.equals(col.getToTable())){
				throw new SQLParseException("union column number/types are different,table1=" + tmp +",table2="+ col.getToTable());
			}
		}
	}
	
}
