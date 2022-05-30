package com.vo;

import java.sql.Date;

public class ProductVO {
	// Fields
	private int id;
	private String name;
	private int price;
	private Date regdate;
	private float rate;
	
	// Constructor
	public ProductVO() {
	}
	public ProductVO(int id, String name, int price, Date regdate, float rate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.regdate = regdate;
		this.rate = rate;
	}
	public ProductVO(int id, String name, int price, float rate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rate = rate;
	}
	public ProductVO(String name, int price, Date regdate, float rate) {
		this.name = name;
		this.price = price;
		this.regdate = regdate;
		this.rate = rate;
	}
	public ProductVO(String name, int price, float rate) {
		this.name = name;
		this.price = price;
		this.rate = rate;
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
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	// toString
	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", price=" + price + ", regdate=" + regdate + ", rate=" + rate
				+ "]";
	}
}
