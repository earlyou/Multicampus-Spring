package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CateService;
import com.vo.CateVO;

public class CateInsertTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		CateService service = 
				(CateService) factory.getBean("caservice");
		
		CateVO ca = new CateVO(12, "long pants", 10);
		List<CateVO> list = null;
		try {
			service.register(ca);
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (CateVO cateVO : list) {
			System.out.println(cateVO);
		}
	}
}