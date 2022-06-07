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
public class CartVO {
	private int id;
	private String uid;
	private int pid;
	private String pname;	// product name
	private int pprice;		// product price
	private String catename;// category name
	private Date regdate;
	private int cnt;	// cart에 얼마나 많은 제품을 담았는지 count
	
	// Constructor
	public CartVO(String uid, int pid, int cnt) {
		this.uid = uid;
		this.pid = pid;
		this.cnt = cnt;
	}
	public CartVO(int id, String uid, int pid, int cnt) {
		this.id = id;
		this.uid = uid;
		this.pid = pid;
		this.cnt = cnt;
	}
}
