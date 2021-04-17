package com.diven.common.hive.blood.graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;

import org.jgrapht.Graph;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;

import com.diven.common.hive.blood.model.FieldBlood;
import com.diven.common.hive.blood.model.FieldBloodTree;
import com.diven.common.hive.blood.model.FieldVertex;
import com.diven.common.hive.blood.model.HiveField;
import com.diven.common.hive.blood.model.HiveTableEdge;
import com.diven.common.hive.blood.model.HiveTableNode;
import com.diven.common.hive.blood.model.TableBlood;
import com.diven.common.hive.blood.model.TableVertex;
import com.mxgraph.layout.mxParallelEdgeLayout;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.swing.mxGraphComponent;

public class GraphUI {
	
	/**
	 * 	展示血缘图
	 * @param graph
	 */
	public static <Vertex, Edge> void show(Graph<Vertex, Edge> graph) {
		JGraphXAdapter<Vertex, Edge> graphx= new JGraphXAdapter<>(graph);
		mxGraphComponent graphComponent = new mxGraphComponent(graphx);
        JFrame frame = new JFrame();
        frame.getContentPane().add(graphComponent);
        new mxHierarchicalLayout(graphx).execute(graphx.getDefaultParent());
        new mxParallelEdgeLayout(graphx).execute(graphx.getDefaultParent());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
	
	/**
	 * 展示字段血缘图
	 * @param blood
	 */
	public static void show(TableBlood blood) {
		Graph<TableVertex, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class); 
		for(HiveTableNode node : blood.getNodes()) {
			graph.addVertex(new TableVertex(node.getDbName(), node.getTableName()));
		}
		for(HiveTableEdge edge : blood.getEdges()) {
			graph.addEdge(
				new TableVertex(edge.getSource().getDbName(), edge.getSource().getTableName()), 
				new TableVertex(edge.getTarget().getDbName(), edge.getTarget().getTableName()),
				new DefaultEdge());
		}
		show(graph);
	}
	
	/**
	 * 展示表的字段属性图
	 * @param blood
	 */
	public static void show(List<HiveField> fields) {
		Graph<Object, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
		//关联表与字段
		for(HiveField field : fields) {
			graph.addVertex(new TableVertex(field.getDbName(), field.getTableName()));
			graph.addVertex(new FieldVertex(field.getDbName(), field.getTableName(), field.getFieldName()));
			graph.addEdge(
				new TableVertex(field.getDbName(), field.getTableName()), 
				new FieldVertex(field.getDbName(), field.getTableName(), field.getFieldName()), 
				new DefaultEdge());
		}
		//展示
		show(graph);
	}
	
	
	/**
	 * 展示字段血缘图
	 * @param blood
	 */
	public static void show(FieldBlood blood) {
		Graph<Object, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);
		//获取字段血缘图
		Set<FieldBloodTree> bloodTrees = new HashSet<>(blood.values());
		getFieldBloodGraph(graph, bloodTrees, null);
		//关联表与字段
		for(HiveField field : blood.keySet()) {
			graph.addVertex(new TableVertex(field.getDbName(), field.getTableName()));
			graph.addVertex(new FieldVertex(field.getDbName(), field.getTableName(), field.getFieldName()));
			graph.addEdge(
				new FieldVertex(field.getDbName(), field.getTableName(), field.getFieldName()), 
				new TableVertex(field.getDbName(), field.getTableName()), 
				new DefaultEdge());
		}
		//展示
		show(graph);
	}
	
	
	
	/**
	 * 获取字段血缘图（递归）
	 * @param graph
	 * @param bloodTrees
	 * @param target
	 */
	private static void getFieldBloodGraph(Graph<Object, DefaultEdge> graph, Set<FieldBloodTree> bloodTrees, FieldBloodTree target) {
		for(FieldBloodTree bloodTree : bloodTrees) {
			graph.addVertex(new FieldVertex(bloodTree.getDbName(), bloodTree.getTableName(), bloodTree.getFieldName()));
			if(target != null) {
				graph.addEdge(
						new FieldVertex(bloodTree.getDbName(), bloodTree.getTableName(), bloodTree.getFieldName()), 
						new FieldVertex(target.getDbName(), target.getTableName(), target.getFieldName()),
						new DefaultEdge());
			}
			getFieldBloodGraph(graph, bloodTree.getChildren(), bloodTree);
		}
	}
	
}
