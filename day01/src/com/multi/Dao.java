package com.multi;

public class Dao {
	public void insert(UserVO user) {
		// SQL문을 이용, DB에 Insert
		System.out.println("Inserted: "+user);
	}
}
