package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CartService;
import com.vo.CartVO;

public class CartUpdateTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		CartService service = 
				(CartService) factory.getBean("carservice");
		
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date d = null;
		List<CartVO> list = null;
		try {
			d = format.parse("1996-08-19");
			CartVO car = new CartVO(7665, "id03", 1002, d);
			service.modify(car);
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (CartVO cartVO : list) {
			System.out.println(cartVO);
		}
	}
}
