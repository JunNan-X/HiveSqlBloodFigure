package com.diven.common.hive.blood.utils;

import com.diven.common.hive.blood.model.TableVertex;

public class SplitUtil {
	
	public static TableVertex splitDbTable(String bd_table) {
		if(bd_table == null || bd_table.trim().isEmpty()) {
			return null;
		}
		if(bd_table.contains(".")) {
			return new TableVertex(bd_table.split("\\.")[0], bd_table.split("\\.")[1]);
		}
		else {
			return null;
		}
	}
	
}
