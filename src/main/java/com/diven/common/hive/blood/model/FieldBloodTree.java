package com.diven.common.hive.blood.model;

import java.util.HashSet;
import java.util.Set;

public class FieldBloodTree extends Base{

	private static final long serialVersionUID = 699943115485558873L;
	
	private String dbName = "default";
	private String tableName;
	private String fieldName;
	
	private Set<FieldBloodTree> children = new HashSet<>();

	public FieldBloodTree(String tableName, String fieldName) {
		this.tableName = tableName;
		this.fieldName = fieldName;
	}

	public FieldBloodTree(String dbName, String tableName, String fieldName) {
		if(dbName != null && !dbName.isEmpty()) {
			this.dbName = dbName;
		}
		this.tableName = tableName;
		this.fieldName = fieldName;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		if(dbName != null && !dbName.isEmpty()) {
			this.dbName = dbName;
		}
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Set<FieldBloodTree> getChildren() {
		return children;
	}

	public void setChildren(Set<FieldBloodTree> children) {
		this.children = children;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dbName == null) ? 0 : dbName.hashCode());
		result = prime * result + ((fieldName == null) ? 0 : fieldName.hashCode());
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
		FieldBloodTree other = (FieldBloodTree) obj;
		if (dbName == null) {
			if (other.dbName != null)
				return false;
		} else if (!dbName.equals(other.dbName))
			return false;
		if (fieldName == null) {
			if (other.fieldName != null)
				return false;
		} else if (!fieldName.equals(other.fieldName))
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
		return "FieldBloodTree [dbName=" + dbName + ", tableName=" + tableName + ", fieldName=" + fieldName
				+ ", children=" + children + "]";
	}
	
}
