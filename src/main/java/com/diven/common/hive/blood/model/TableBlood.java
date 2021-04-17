package com.diven.common.hive.blood.model;

import java.util.ArrayList;
import java.util.List;

public class TableBlood extends Base{

	private static final long serialVersionUID = 3463592007415583275L;

	private List<HiveTableNode> nodes = new ArrayList<>();
	private List<HiveTableEdge>   edges = new ArrayList<>();
	
	public TableBlood(List<HiveTableNode> nodes, List<HiveTableEdge> edges) {
		this.nodes = nodes;
		this.edges = edges;
	}

	public List<HiveTableNode> getNodes() {
		return nodes;
	}

	public void setNodes(List<HiveTableNode> nodes) {
		this.nodes = nodes;
	}

	public List<HiveTableEdge> getEdges() {
		return edges;
	}

	public void setEdges(List<HiveTableEdge> edges) {
		this.edges = edges;
	}

	@Override
	public String toString() {
		return "TableBlood [nodes=" + nodes + ", edges=" + edges + "]";
	}
	
}
