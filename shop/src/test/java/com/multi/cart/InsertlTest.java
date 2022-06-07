package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class InsertlTest {

	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		CartVO cart = new CartVO("id02", 1006, 2);
		try {
			biz.register(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
