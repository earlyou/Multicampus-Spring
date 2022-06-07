package com.multi.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductVO {
	private int id;
	private String name;
	private int price;
	private Date regdate;
	private int cid;
	private String catename;	// 나중에 join을 대비한 Field
	private String imgname;
	
	// Constructor
	public ProductVO(int id, String name, int price, int cid, String imgname) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.cid = cid;
		this.imgname = imgname;
	}
}
