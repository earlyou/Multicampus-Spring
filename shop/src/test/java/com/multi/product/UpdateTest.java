package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		ProductVO prod = new ProductVO(1006, "water", 6000, 11, "water.png");
		try {
			biz.modify(prod);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
