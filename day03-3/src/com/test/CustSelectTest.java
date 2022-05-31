package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CustService;
import com.vo.CustVO;

public class CustSelectTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		CustService service = 
				(CustService) factory.getBean("cservice");
		
		CustVO c = null;
		try {
			c = service.get("id01");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(c);
	}
}
