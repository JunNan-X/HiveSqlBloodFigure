package com.diven.common.hive.blood.model;

public class HiveTable extends Base{
	
	private static final long serialVersionUID = -1040938868973335902L;
	private String dbName = "default";
	private String tableName;
	
	public HiveTable(String tableName) {
		this.tableName = tableName;
	}

	public HiveTable(String dbName, String tableName) {
		this.dbName = dbName;
		this.tableName = tableName;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	@Override
	public String toString() {
		return "HiveTable [dbName=" + dbName + ", tableName=" + tableName + "]";
	}
	
}
