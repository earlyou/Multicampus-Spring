package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductUpdateTests {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		ProductVO prod = new ProductVO(5, "mouse", 65000, null, 2.1);
		try {
			biz.modify(prod);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}





