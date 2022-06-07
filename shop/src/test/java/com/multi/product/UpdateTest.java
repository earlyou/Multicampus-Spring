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
		ProductVO prod = new ProductVO(1007, "name", 10000, null, 20, null, "img.jpg");
		try {
			biz.modify(prod);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
