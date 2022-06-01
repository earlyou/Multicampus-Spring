package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CateService;
import com.vo.CateVO;

public class CateSelectTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		CateService service = 
				(CateService) factory.getBean("caservice");
		
		CateVO ca = null;
		try {
			ca = service.get(11);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(ca);
	}
}
