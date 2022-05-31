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
		
		// Service interface�� searchname�� �������� �ʾұ� ������ ���� �ʴ´�.
		ProductService service = 
				(ProductService) factory.getBean("pservice");
		
		List<ProductVO> list = null;
		try {
			list = service.searchname("p");	// "p"�� ����ִ� ��ǰ ��ȸ
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (ProductVO productVO : list) {
			System.out.println(productVO);
		}
	}
}