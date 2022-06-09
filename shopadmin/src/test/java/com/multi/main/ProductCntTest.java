package com.multi.main;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MainBiz;

@SpringBootTest
class ProductCntTest {

	@Autowired
	MainBiz biz;
	
	@Test
	void contextLoads() {
		try {
			System.out.println(biz.getProductCnt());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
