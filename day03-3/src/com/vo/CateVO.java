package com.vo;

public class CateVO {
	// Field
	private int id;
	private String name;
	private int pid;
	
	// Constructor
	public CateVO() {
	}
	public CateVO(int id, String name, int pid) {
		this.id = id;
		this.name = name;
		this.pid = pid;
	}
	
	// Getter & Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	// toString
	@Override
	public String toString() {
		return "CateVO [id=" + id + ", name=" + name + ", pid=" + pid + "]";
	}
}
