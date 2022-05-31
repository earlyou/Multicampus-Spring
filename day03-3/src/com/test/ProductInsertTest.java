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
			System.out.println("�Է� ������ �߻� �Ͽ����ϴ�.");
//			e.printStackTrace();	// ���� �޼��� ���ϰ� ���� ���� ��ɾ�
		}
	}
}
