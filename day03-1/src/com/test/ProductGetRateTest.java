package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.service.ProductService;
import com.vo.ProductVO;

public class ProductGetRateTest {

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
			list = service.getrate(5.0);	// rate�� 5.0���� ū product ��ȸ
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (ProductVO productVO : list) {
			System.out.println(productVO);
		}
	}
}