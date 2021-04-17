package com.diven.common.hive.blood.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.diven.common.hive.blood.utils.Check;


/**
 * 	生成的列的血缘关系
 * @author divenwu
 */
public class ColLine extends Base{
	private static final long serialVersionUID = -1690060728674289074L;
	
	// 解析sql出来的列名称
	private String toNameParse; 
	// 带条件的源字段
	private String colCondition; 
	// 源字段
	private Set<String> fromNameSet = new LinkedHashSet<String>(); 
	 // 计算条件
	private Set<String> conditionSet = new LinkedHashSet<String>();
	private Set<String> allConditionSet = new LinkedHashSet<String>();

	// 解析出来输出表
	private String toTable; 
	// 查询元数据出来的列名称
	private String toName; 

	private static final String CON_COLFUN = "COLFUN:";

	public ColLine() {
	}

	public ColLine(String toNameParse, String colCondition, Set<String> fromNameSet, Set<String> conditionSet,
			String toTable, String toName) {
		this.toNameParse = toNameParse;
		this.colCondition = colCondition;
		this.fromNameSet = fromNameSet;
		this.conditionSet = conditionSet;
		this.toTable = toTable;
		this.toName = toName;
	}

	public String getToNameParse() {
		return toNameParse;
	}

	public void setToNameParse(String toNameParse) {
		this.toNameParse = toNameParse;
	}

	public String getColCondition() {
		return colCondition;
	}

	public void setColCondition(String colCondition) {
		this.colCondition = colCondition;
	}

	public Set<String> getFromNameSet() {
		return fromNameSet;
	}

	public void setFromNameSet(Set<String> fromNameSet) {
		this.fromNameSet = fromNameSet;
	}

	public Set<String> getConditionSet() {
		return conditionSet;
	}

	public void setConditionSet(Set<String> conditionSet) {
		this.conditionSet = conditionSet;
	}

	public String getToTable() {
		return toTable;
	}

	public void setToTable(String toTable) {
		this.toTable = toTable;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	public Set<String> getAllConditionSet() {
		allConditionSet.clear();
		if (needAdd()) {
			allConditionSet.add(CON_COLFUN + colCondition);
		}
		allConditionSet.addAll(conditionSet);
		return allConditionSet;
	}

	private boolean needAdd() {
		if (Check.notEmpty(colCondition)) {
			if (Check.isEmpty(fromNameSet)) {
				return true;
			}
			String[] split = colCondition.split("&");
			if (split.length > 0) {
				for (String string : split) {
					if (Check.notEmpty(fromNameSet) && !fromNameSet.contains(string)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public Set<String> getFromTableSet() {
		Set<String> fromTableSet = new LinkedHashSet<String>();
		for(String item : fromNameSet) {
			fromTableSet.add(item.substring(0, item.lastIndexOf(".")));
		}
		return fromTableSet;
	}
	
	public String getToTableFieldParse() {
		return getToTableFieldParse(true);
	}
	
	public String getToTableFieldParse(boolean speculate) {
		if(toNameParse == null || toNameParse.isEmpty()) {
			if(speculate) {
				Set<String> set = new HashSet<>();
				for(String item : this.getFromNameSet()) {
					set.add(item.substring(item.lastIndexOf(".") +1));
				}
				if(set.size() == 1) {
					return toTable +"." +set.toArray()[0]; 
				}
			}
			return toTable +".?";
		}
		else {
			return toTable +"." +toNameParse;
		}
	}
	
	/**
	 *  对不明确的字段进行详细拆分
	 * @param split
	 * @return
	 */
	public Set<String> getFromNameSet(boolean split) {
		if(split) {
			Set<String> fromNameSetSplit = new LinkedHashSet<String>(); 
			for(String from : fromNameSet) {
				if(from.contains("&")) {
					String field = from.substring(from.lastIndexOf(".")+1);
					for(String table : from.substring(0, from.lastIndexOf(".")).split("&")) {
						fromNameSetSplit.add(table + "." + field);
					}
				}
				else {
					fromNameSetSplit.add(from);
				}
			}
			return fromNameSetSplit;
		}
		return fromNameSet;
	}
	
	@Override
	public String toString() {
		return "ColLine [fromNameSet="+ fromNameSet+ ", toTable=" + toTable + ", toNameParse=" + toNameParse + ", colCondition=" + colCondition
				+ ", conditionSet=" + conditionSet + ", allConditionSet=" + allConditionSet 
				+ ", toName=" + toName + "]";
	}
	
}