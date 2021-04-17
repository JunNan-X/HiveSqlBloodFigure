package com.diven.common.hive.blood.model;

public class HiveTableNode extends Base{
	
	private static final long serialVersionUID = -1040938868973335902L;
	private Integer id;
	private String dbName = "default";
	private String tableName;
	
	public HiveTableNode(String tableName) {
		this.tableName = tableName;
	}

	public HiveTableNode(String dbName, String tableName) {
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

	public Integer getId() {
		if(this.id == null) {
			return hashCode();
		}
		else {
			return this.id;
		}
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dbName == null) ? 0 : dbName.hashCode());
		result = prime * result + ((tableName == null) ? 0 : tableName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HiveTableNode other = (HiveTableNode) obj;
		if (dbName == null) {
			if (other.dbName != null)
				return false;
		} else if (!dbName.equals(other.dbName))
			return false;
		if (tableName == null) {
			if (other.tableName != null)
				return false;
		} else if (!tableName.equals(other.tableName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HiveTableNode [id=" + getId() + ", dbName=" + dbName + ", tableName=" + tableName + "]";
	}

}
