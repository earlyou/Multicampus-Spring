package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class SelectTest {

	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		CartVO cart = null;
		try {
			cart = biz.get(8002);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(cart);
	}

}
