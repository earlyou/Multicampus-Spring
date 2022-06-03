package com.multi.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductVO {
	// Field
	private int id;
	private String name;
	private int price;
	private String regdate;
	private double rate;
	
	// Constructor
	public ProductVO(String name, int price, String regdate, double rate) {
		this.name = name;
		this.price = price;
		this.regdate = regdate;
		this.rate = rate;
	}
}
