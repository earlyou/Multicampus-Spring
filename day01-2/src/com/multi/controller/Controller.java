package com.multi.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multi.frame.Service;
import com.multi.vo.UserVO;

public class Controller {

	public static void main(String[] args) {
		System.out.println("Spring Start ..");
		
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		// 鉴规氢 力绢, tightly coupled
		// Service service = new UserService();
		
		// IoC(Inversion of Control) 力绢 开青 loosely coupled
		Service service = (Service) factory.getBean("uservice");
		
		UserVO user = new UserVO("id01","pwd01","lee");
		service.register(user);
	}
}
