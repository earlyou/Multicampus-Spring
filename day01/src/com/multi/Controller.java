package com.multi;

public class Controller {

	public static void main(String[] args) {
		// 요청을 받으면 처리하는 역할
		Service service = new Service();	// Controller는 Service가 필요
		UserVO user = new UserVO("id01","pwd01","lee");
		
		service.register(user);
	}

}
