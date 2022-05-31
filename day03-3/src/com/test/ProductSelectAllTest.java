package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ProductService;
import com.vo.ProductVO;

public class ProductSelectAllTest {

	public static void main(String[] args) {
		// forming Spring environment
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		// IoC, Inversion of Control
		ProductService service = 
				(ProductService) factory.getBean("pservice");
		
		List<ProductVO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (ProductVO p : list) {
			System.out.println(p);
		}
	}
}