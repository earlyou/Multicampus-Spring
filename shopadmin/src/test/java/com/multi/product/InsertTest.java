package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class InsertTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		ProductVO prod = new ProductVO(0, "vese", 9400, 33,"img12");
		try {
			biz.register(prod);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
