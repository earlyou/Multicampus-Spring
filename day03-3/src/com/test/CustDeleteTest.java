package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CustService;
import com.vo.CustVO;

public class CustDeleteTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		CustService service = 
				(CustService) factory.getBean("cservice");
		
		List<CustVO> list = null;
		try {
			service.remove("id03");
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (CustVO custVO : list) {
			System.out.println(custVO);
		}
	}
}
