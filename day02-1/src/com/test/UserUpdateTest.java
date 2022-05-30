package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;
import com.vo.UserVO;

public class UserUpdateTest {

	public static void main(String[] args) {
		// forming Spring environment
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		// IoC, Inversion of Control
		Service<String, UserVO> service = 
				(Service<String, UserVO>) factory.getBean("uservice");
		
		UserVO u = new UserVO("id02", "pwd22", "shin");
		
		service.modify(u);
	}
}
