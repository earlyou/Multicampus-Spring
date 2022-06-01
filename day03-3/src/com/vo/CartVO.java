package com.vo;

import java.util.Date;

public class CartVO {
	// Field
	private int id;
	private String uid;
	private int pid;
	private Date regdate;
	
	// Constructor
	public CartVO() {
	}
	public CartVO(int id, String uid, int pid, Date regdate) {
		this.id = id;
		this.uid = uid;
		this.pid = pid;
		this.regdate = regdate;
	}
	
	// Getter & Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Date getDate() {
		return regdate;
	}
	public void setDate(Date regdate) {
		this.regdate = regdate;
	}
	
	// toString
	@Override
	public String toString() {
		return "CartVO [id=" + id + ", uid=" + uid + ", pid=" + pid + ", regdate=" + regdate + "]";
	}
}
