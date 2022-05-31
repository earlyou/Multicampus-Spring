package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ProductService;
import com.vo.ProductVO;

public class ProductUpdateTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		ProductService service = 
				(ProductService) factory.getBean("pservice");
		
		ProductVO p = new ProductVO(1002, "spao", 15000, 21);
		try {
			service.modify(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
