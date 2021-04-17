package com.diven.common.hive.blood.utils;

import java.util.HashSet;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

import com.diven.common.hive.blood.model.FieldBloodTree;
import com.diven.common.hive.blood.model.FieldVertex;

public class GraphUtil {
	
	public static FieldBloodTree convertToFieldTree(FieldVertex vertex, Graph<FieldVertex, DefaultEdge> graph) {
		FieldBloodTree tree = new FieldBloodTree(vertex.getDbName(), vertex.getTableName(), vertex.getFieldName());
		//获取与顶点有关的所有关系
		Set<DefaultEdge> edges = new HashSet<>();
		edges.addAll(graph.edgesOf(vertex));
		//子 节点
		Set<FieldBloodTree> children = new HashSet<>();
		for(DefaultEdge edge : edges) {
			//获取相关节点
			FieldVertex sourceVertex = graph.getEdgeSource(edge);
			FieldVertex targetVertex = graph.getEdgeTarget(edge);
			//删除关系节点
			graph.removeEdge(edge);
			//添加并递回
			if(!sourceVertex.equals(vertex)) {
				children.add(convertToFieldTree(sourceVertex, graph));
			}
			if(!targetVertex.equals(vertex)) {
				children.add(convertToFieldTree(targetVertex, graph));
			}
		}
		//添加子节点
		tree.setChildren(children);
		return tree;
	}
	
}
