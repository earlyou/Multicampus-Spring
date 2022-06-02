package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CartService;
import com.vo.CartVO;

public class CartSelectAllTest {
	public static void main(String[] args) {
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring.xml");
		
		CartService service = 
				(CartService) factory.getBean("carservice");
		
		List<CartVO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (CartVO cartVO : list) {
			System.out.println(cartVO);
		}
		// 작동 안하는 이유, CartVO에 join이 될 영역의 Field를 만들어주지 않았기 때문이다.
	}
}
