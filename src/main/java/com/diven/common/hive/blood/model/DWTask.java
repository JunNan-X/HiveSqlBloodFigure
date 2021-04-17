package com.diven.common.hive.blood.model;

/**
 * 	数据仓库任务
 * @author divenwu
 */
public class DWTask extends Base{
	private static final long serialVersionUID = 3677871203504695808L;
	
	private long id;
	private String name;
	private String path;
	private String user;
	private String mail;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}