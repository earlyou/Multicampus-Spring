package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class SelectTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		ProductVO prod = null;
		try {
			prod = biz.get(1023);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(prod);
	}

}
