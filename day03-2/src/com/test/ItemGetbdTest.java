package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ItemService;
import com.vo.ItemVO;

public class ItemGetbdTest {

	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		ItemService service = 
				(ItemService) factory.getBean("iservice");
		
		List<ItemVO> list = null;
		String d = "2022-05-30";
		DateFormat format = new SimpleDateFormat("yyyy-mmmm-dd");
		Date date;
		try {
			date = format.parse(d);
			list = service.getbd(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (ItemVO itemVO : list) {
			System.out.println(itemVO);
		}
	}
}