package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.service.ProductService;
import com.vo.ProductVO;

public class ProductSearchNameTest {

	public static void main(String[] args) {
		// forming Spring environment
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		// IoC, Inversion of Control
//		Service<Integer, ProductVO> service = 
//				(Service<Integer, ProductVO>) factory.getBean("pservice");
		
		// Service interface는 searchname을 정의하지 않았기 때문에 쓰지 않는다.
		ProductService service = 
				(ProductService) factory.getBean("pservice");
		
		List<ProductVO> list = null;
		try {
			list = service.searchname("p");	// "p"가 들어있는 상품 조회
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (ProductVO productVO : list) {
			System.out.println(productVO);
		}
	}
}