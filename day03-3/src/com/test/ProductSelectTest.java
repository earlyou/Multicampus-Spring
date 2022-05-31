package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ProductService;
import com.vo.ProductVO;

public class ProductSelectTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		ProductService service = 
				(ProductService) factory.getBean("pservice");
		
		ProductVO p = null;
		try {
			p = service.get(1003);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(p);
	}
}
