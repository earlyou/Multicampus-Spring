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

public class CustInsertTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		CustService service = 
				(CustService) factory.getBean("cservice");
		
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date d = null;
		List<CustVO> list = null;
		CustVO c = null;
		try {
			d = format.parse("2022-05-31");
			c = new CustVO("id03", "shin", "Cheongju", d);
			service.register(c);
			list = service.get();
			for (CustVO custVO : list) {
				System.out.println(custVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
