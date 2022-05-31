package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemUpdateTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer, ItemVO> service = 
				(Service<Integer, ItemVO>) factory.getBean("iservice");
		
		ItemVO item = new ItemVO(1003, "pen", 1500, "pen.jpg");
		try {
			service.modify(item);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
