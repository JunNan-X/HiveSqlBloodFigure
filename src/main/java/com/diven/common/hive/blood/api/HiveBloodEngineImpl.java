package com.diven.common.hive.blood.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.traverse.BreadthFirstIterator;

import com.diven.common.hive.blood.model.ColLine;
import com.diven.common.hive.blood.model.FieldBlood;
import com.diven.common.hive.blood.model.FieldBloodTree;
import com.diven.common.hive.blood.model.FieldVertex;
import com.diven.common.hive.blood.model.HiveField;
import com.diven.common.hive.blood.model.HiveTable;
import com.diven.common.hive.blood.model.HiveTableEdge;
import com.diven.common.hive.blood.model.HiveTableNode;
import com.diven.common.hive.blood.model.SQLResult;
import com.diven.common.hive.blood.model.TableBlood;
import com.diven.common.hive.blood.model.TableVertex;
import com.diven.common.hive.blood.parse.HiveSqlBloodFigureParser;
import com.diven.common.hive.blood.utils.GraphUtil;
import com.diven.common.hive.blood.utils.HqlUtil;
import com.diven.common.hive.blood.utils.SplitUtil;

public class HiveBloodEngineImpl implements HiveBloodEngine {
	
	@Override
	public List<SQLResult> parser(List<String> hqls) throws Exception {
		return new HiveSqlBloodFigureParser().parse(HqlUtil.ListToString(hqls));
	}
	
	@Override
	public TableBlood getTableBlood(List<String> hqls) throws Exception {
		//解析sql
		List<SQLResult> results = this.parser(hqls);
		//构建图
		DefaultDirectedGraph<TableVertex, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
		for(SQLResult result : results){
			//表节点信息
			for(String bd_table : result.getInputTables()) {
				TableVertex vertex = SplitUtil.splitDbTable(bd_table);
				if(vertex != null) {
					graph.addVertex(vertex);
				}
			}
			for(String bd_table : result.getOutputTables()) {
				TableVertex vertex = SplitUtil.splitDbTable(bd_table);
				if(vertex != null) {
					graph.addVertex(vertex);
				}
			}
			for(String start : result.getInputTables()) {
				TableVertex startVertex = SplitUtil.splitDbTable(start);
				if(startVertex != null) {
					for(String end : result.getOutputTables()) {
						TableVertex endVertex = SplitUtil.splitDbTable(end);
						if(endVertex != null) {
							graph.addEdge(startVertex, endVertex, new DefaultEdge());
						}
					}
				}
			}
		}
		//抽取图
		List<HiveTableNode> nodes = new ArrayList<>();		//节点
		Set<TableVertex> vertexs = graph.vertexSet();
		for(TableVertex vertex : vertexs){
			nodes.add(new HiveTableNode(vertex.getDbName(), vertex.getTableName()));
		}
		List<HiveTableEdge>   edges = new ArrayList<>();	//边
		Set<DefaultEdge> tedges = graph.edgeSet();
        for(DefaultEdge edge : tedges){
        	TableVertex source = graph.getEdgeSource(edge);
        	TableVertex target 	= graph.getEdgeTarget(edge);
        	edges.add(
        		new HiveTableEdge(
        			new HiveTableNode(source.getDbName(), source.getTableName()), 
        			new HiveTableNode(target.getDbName(), target.getTableName())
        		));
        }
        //返回结果
		return new TableBlood(nodes, edges);
	}

	@Override
	public List<HiveField> getTableFields(List<String> hqls, HiveTable table) throws Exception {
		List<HiveField> fields = new ArrayList<>();
		//解析sql
		List<SQLResult> results = this.parser(hqls);
		for(SQLResult result : results){
			for(ColLine colLine : result.getColLineList()) {
				//处理来源字段
				Set<String> fromNameSet = colLine.getFromNameSet();
				for(String fromName : fromNameSet) {
					String temp[] = fromName.split("\\.");
					if(temp.length == 3 && temp[0].equals(table.getDbName()) && temp[1].equals(table.getTableName())) {
						HiveField field = new HiveField(table.getDbName(), table.getTableName(), temp[2]);
						if(!fields.contains(field)) {
							fields.add(field);
						}
					}
				}
				//处理目标字段
				String temp[] =colLine.getToTable().split("\\.");
				if(temp.length == 2 && temp[0].equals(table.getDbName()) && temp[1].equals(table.getTableName())) {
					HiveField field = new HiveField(table.getDbName(), table.getTableName(), colLine.getToNameParse());
					if(!fields.contains(field)) {
						fields.add(field);
					}
				}
			}
		}
		//返回
		return fields;
	}

	@Override
	public FieldBlood getFieldBloodByTable(List<String> hqls, HiveTable table) throws Exception {
		//解析sql
		List<SQLResult> results = this.parser(hqls);
		//获取字段血缘图
		DefaultDirectedGraph<FieldVertex, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
		for(SQLResult result : results){
			for(ColLine colLine : result.getColLineList()) {
				//处理目标字段
				FieldVertex targetFieldVertex = null;
				String tempTarget[] =colLine.getToTable().split("\\.");
				if(tempTarget.length == 2) {
					//目标字段节点
					targetFieldVertex = new FieldVertex(tempTarget[0], tempTarget[1], colLine.getToNameParse());
					graph.addVertex(targetFieldVertex);
				}
				//处理来源字段
				Set<String> fromNameSet = colLine.getFromNameSet();
				for(String fromName : fromNameSet) {
					String tempFrom[] = fromName.split("\\.");
					if(tempFrom.length == 3) {
						//来源字段节点
						FieldVertex soruceFieldVertex = new FieldVertex(tempFrom[0], tempFrom[1], tempFrom[2]);
						graph.addVertex(soruceFieldVertex);
						//添加关系
						graph.addEdge(targetFieldVertex, soruceFieldVertex, new DefaultEdge());
					}
				}
			}
		}
		//获取血缘
		FieldBlood fieldBlood = new FieldBlood();
		List<HiveField> fields = this.getTableFields(hqls, table);
		for(HiveField field : fields) {
			FieldVertex fieldVertex = new FieldVertex(field.getDbName(), field.getTableName(), field.getFieldName());
			if(graph.containsVertex(fieldVertex)) {
				BreadthFirstIterator<FieldVertex, DefaultEdge> breadth = new BreadthFirstIterator<>(graph, fieldVertex);
				Set<FieldVertex> subNode = new HashSet<>();
				while (breadth.hasNext()) {
					subNode.add(breadth.next());
				}
				AsSubgraph<FieldVertex, DefaultEdge> subgraph = new AsSubgraph<>(graph, subNode);
				FieldBloodTree fieldBloodTree = GraphUtil.convertToFieldTree(fieldVertex, subgraph);
				fieldBlood.put(field, fieldBloodTree);
			}
		}
		//返回字段血缘
		return fieldBlood;
	}
	
}
