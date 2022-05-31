package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.UserVO;

public class UserInsertTest {

	public static void main(String[] args) {
		// forming Spring environment
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		// IoC, Inversion of Control
		Service<String, UserVO> service = 
				(Service<String, UserVO>) factory.getBean("uservice");
		
		UserVO u = new UserVO("id89", "pwd89", "lee");
		try {
			service.register(u);
		} catch (Exception e) {
			System.out.println("입력 오류가 발생 하였습니다.");
//			e.printStackTrace();	// 에러 메세지 상세하게 보기 위한 명령어
		}
	}
}
