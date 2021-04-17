package com.diven.common.hive.blood.utils;

import java.util.List;

public class HqlUtil {
	
	public static String ListToString(List<String> hqls) {
		StringBuffer buffer = new StringBuffer();
		if(hqls != null) {
			for(String sql : hqls) {
				sql = sql.trim();
				boolean flag = false;
				for(String line : sql.split("\n")) {
					if(line.trim().startsWith("--")) {
						continue;
					}
					if(!line.trim().isEmpty()) {
						flag = true;
						buffer.append(line).append("\n");	
					}
				}
				if(flag && !sql.endsWith(";")) {
					buffer.append(";");
				}
			}
		}
		return buffer.toString();
	}
	
}
