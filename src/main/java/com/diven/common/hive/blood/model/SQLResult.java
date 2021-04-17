package com.diven.common.hive.blood.model;

import java.util.List;
import java.util.Set;

/**
 * 	结果结构
 * 	@author divenwu
 */
public class SQLResult extends Base{
	private static final long serialVersionUID = 3960836341568034438L;
	
	private String currentSql;
	//sql中的输入表
	Set<String> outputTables;
	//sql中的输出表
	Set<String> inputTables;
	//sql中的字段血缘列表
	List<ColLine> colLineList;

	public String getCurrentSql() {
		return currentSql;
	}

	public void setCurrentSql(String currentSql) {
		this.currentSql = currentSql;
	}

	public Set<String> getOutputTables() {
		return outputTables;
	}

	public void setOutputTables(Set<String> outputTables) {
		this.outputTables = outputTables;
	}

	public Set<String> getInputTables() {
		return inputTables;
	}

	public void setInputTables(Set<String> inputTables) {
		this.inputTables = inputTables;
	}

	public List<ColLine> getColLineList() {
		return colLineList;
	}

	public void setColLineList(List<ColLine> colLineList) {
		this.colLineList = colLineList;
	}

}
