package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ProductService;

public class ProductDeleteTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		ProductService service = 
				(ProductService) factory.getBean("pservice");
		
		try {
			service.remove(1005);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
