package com.vo;

import java.util.Date;

public class ProductVO {
	// Field
	private int id;			// auto_increment
	private String name;
	private int price;
	private Date regdate;
	private int cid;
	private String catename;// category name, JOIN을 위해서 필드 생성, crud할 땐 쓰지 않음
	
	// Constructor
	public ProductVO() {
	}
	public ProductVO(int id, String name, int price, Date regdate, int cid, String catename) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.regdate = regdate;
		this.cid = cid;
		this.catename = catename;
	}
	public ProductVO(int id, String name, int price, Date regdate, int cid) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.regdate = regdate;
		this.cid = cid;
	}
	public ProductVO(String name, int price, int cid) {
		this.name = name;
		this.price = price;
		this.cid = cid;
	}
	public ProductVO(int id, String name, int price, int cid) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.cid = cid;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}
	
	// toString
	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", price=" + price + ", regdate=" + regdate + ", cid=" + cid
				+ ", catename=" + catename + "]";
	}
}
