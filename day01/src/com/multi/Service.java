package com.multi;

public class Service {
	Dao dao;		// Dependency, Service�� Dao�� �ʿ��ϴ�
	
	public Service() {
		dao = new Dao();
	}
	
	public void register(UserVO user) {	// ���� register��� ���� ��
		// Security, Log, Transaction
		dao.insert(user);
	}
}