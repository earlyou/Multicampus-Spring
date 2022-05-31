package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;

public class ProductUpdateTest {

	public static void main(String[] args) {
		// forming Spring environment
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		// IoC, Inversion of Control
		Service<Integer, ProductVO> service = 
				(Service<Integer, ProductVO>) factory.getBean("pservice");
		
		ProductVO p = new ProductVO(3, "card", 50000, 2);
		
		try {
			service.modify(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}