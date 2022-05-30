package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;

public class ProductSelectTest {

	public static void main(String[] args) {
		// forming Spring environment
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		// IoC, Inversion of Control
		Service<Integer, ProductVO> service = 
				(Service<Integer, ProductVO>) factory.getBean("pservice");
		
		ProductVO product = null;
		product = service.get(100);
		System.out.println(product);
	}
}