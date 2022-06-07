package com.multi.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CartBiz;
import com.multi.vo.CartVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		CartVO cart = new CartVO(8002, "id01", 1009, 5);
		try {
			biz.modify(cart);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
