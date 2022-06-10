package com.multi.vo;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

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
	// Fields
	private int id;
	private String name;
	private int price;
	private Date regdate;
	private int cid;			// cate id
	private String imgname;		// image name
	private String catename;	// 나중에 join을 대비한 Field
	private String maincatename;
	private MultipartFile mf;	// file 전송 받기 위한 field
	
	// Constructor
	// for update
	public ProductVO(int id, String name, int price, int cid, String imgname) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.cid = cid;
		this.imgname = imgname;
	}
	// for insertion
	public ProductVO(String name, int price, int cid, String imgname) {
		this.name = name;
		this.price = price;
		this.cid = cid;
		this.imgname = imgname;
	}
}
