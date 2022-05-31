package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemDeleteTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer, ItemVO> service = 
				(Service<Integer, ItemVO>) factory.getBean("iservice");
		
		int i = 1002;
		try {
			service.remove(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
