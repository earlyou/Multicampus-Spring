package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;

public class ProductInsertTest {

	public static void main(String[] args) {
		// forming Spring environment
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		// IoC, Inversion of Control
		Service<Integer, ProductVO> service = 
				(Service<Integer, ProductVO>) factory.getBean("pservice");
		
		ProductVO u = new ProductVO("pants", 10000, 11);
		try {
			service.register(u);
		} catch (Exception e) {
			System.out.println("입력 오류가 발생 하였습니다.");
//			e.printStackTrace();	// 에러 메세지 상세하게 보기 위한 명령어
		}
	}
}
