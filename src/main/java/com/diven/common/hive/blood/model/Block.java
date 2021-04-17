package com.diven.common.hive.blood.model;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 	解析的SQL块
 * @author divenwu
 */
public class Block extends Base{
	private static final long serialVersionUID = -4862449285786384062L;
	
	private String condition;
	private Set<String> colSet = new LinkedHashSet<String>();

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Set<String> getColSet() {
		return colSet;
	}

	public void setColSet(Set<String> colSet) {
		this.colSet = colSet;
	}
}