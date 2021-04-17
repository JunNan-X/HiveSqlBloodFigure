package com.diven.common.hive.blood.utils;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.diven.common.hive.blood.model.ColumnNode;


public class MetaCache {
	private static MetaCache instance = new MetaCache();
	
	public static MetaCache getInstance(){
		return instance;
	}
	
	private MetaCache(){}

	private static Map<String, List<ColumnNode>> cMap = new HashMap<String, List<ColumnNode>>();
	private static Map<String, Long> tableMap = new HashMap<String, Long>();
	private static Map<String, Long> columnMap = new HashMap<String, Long>();

	public void release(){
		cMap.clear();
		tableMap.clear();
		columnMap.clear();
	}
	
	public List<String> getColumnByDBAndTable(String table){
		List<ColumnNode> list = cMap.get(table.toLowerCase());
		List<String> list2 = new ArrayList<String>();
		if (Check.notEmpty(list)) {
			for (ColumnNode columnNode : list) {
				list2.add(columnNode.getColumn());
			}
		}
		return list2;
	}
	
	public Map<String, List<ColumnNode>> getcMap() {
		return cMap;
	}

	public Map<String, Long> getTableMap() {
		return tableMap;
	}

	public Map<String, Long> getColumnMap() {
		return columnMap;
	}
}