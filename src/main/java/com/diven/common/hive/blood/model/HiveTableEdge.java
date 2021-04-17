package com.diven.common.hive.blood.model;

public class HiveTableEdge extends Base{

	private static final long serialVersionUID = 1617896370193793668L;
	private Integer id;
	private HiveTableNode source;
	private HiveTableNode target;
	
	public HiveTableEdge(HiveTableNode source, HiveTableNode target) {
		this.source = source;
		this.target = target;
	}
	
	public Integer getId() {
		if(id == null) {
			return this.hashCode();
		}
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public HiveTableNode getSource() {
		return source;
	}

	public void setSource(HiveTableNode source) {
		this.source = source;
	}

	public HiveTableNode getTarget() {
		return target;
	}

	public void setTarget(HiveTableNode target) {
		this.target = target;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
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
		HiveTableEdge other = (HiveTableEdge) obj;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (target == null) {
			if (other.target != null)
				return false;
		} else if (!target.equals(other.target))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HiveTableEdge [id=" + getId() + ", source=" + source + ", target=" + target + "]";
	}
	
}
