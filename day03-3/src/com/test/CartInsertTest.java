package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CartService;
import com.vo.CartVO;

public class CartInsertTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		CartService service = 
				(CartService) factory.getBean("carservice");
		
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date d = null;
		List<CartVO> list = null;
		CartVO car = null;
		try {
			d = format.parse("2022-08-19");
			car = new CartVO(7666, "id03", 1003, d);
			service.register(car);
			list = service.get();
			for (CartVO cartVO : list) {
				System.out.println(cartVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
