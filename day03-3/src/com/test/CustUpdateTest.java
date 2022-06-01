package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CustService;
import com.vo.CustVO;

public class CustUpdateTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		CustService service = 
				(CustService) factory.getBean("cservice");
		
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date d = null;
		List<CustVO> list = null;
		try {
			d = format.parse("1998-07-22");
			CustVO c = new CustVO("id03", "Ahn", "Sejong", d);
			service.modify(c);
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (CustVO custVO : list) {
			System.out.println(custVO);
		}
	}
}
