package com.multi;

public class Controller {

	public static void main(String[] args) {
		// ��û�� ������ ó���ϴ� ����
		Service service = new Service();	// Controller�� Service�� �ʿ�
		UserVO user = new UserVO("id01","pwd01","lee");
		
		service.register(user);
	}

}
