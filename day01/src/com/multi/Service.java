package com.multi;

public class Service {
	Dao dao;		// Dependency, Service는 Dao가 필요하다
	
	public Service() {
		dao = new Dao();
	}
	
	public void register(UserVO user) {	// 보통 register라고 많이 씀
		// Security, Log, Transaction
		dao.insert(user);
	}
}