package com.diven.common.hive.blood.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 	解析的子查询树形结构
 * @author divenwu
 */
public class QueryTree extends Base{
	private static final long serialVersionUID = 2888682925451956205L;
	
	private int id; // 当前子查询节点id
	private int pId; // 父节点子查询树id
	private String current;
	private String parent; // 只需父节点的名字
	private Set<String> tableSet = new HashSet<String>();
	private List<QueryTree> childList = new ArrayList<QueryTree>();
	private List<ColLine> colLineList = new ArrayList<ColLine>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getCurrent() {
		return current;
	}

	public void setCurrent(String current) {
		this.current = current;
	}

	public Set<String> getTableSet() {
		return tableSet;
	}

	public void setTableSet(Set<String> tableSet) {
		this.tableSet = tableSet;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public List<QueryTree> getChildList() {
		return childList;
	}

	public void setChildList(List<QueryTree> childList) {
		this.childList = childList;
	}

	public List<ColLine> getColLineList() {
		return colLineList;
	}

	public void setColLineList(List<ColLine> colLineList) {
		this.colLineList = colLineList;
	}

	@Override
	public String toString() {
		return "QueryTree [current=" + current + ", parent=" + parent + ", pId=" + pId + ", childList=" + childList
				+ "]";
	}

}