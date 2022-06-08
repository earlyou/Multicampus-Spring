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
//		ProductVO prod = new ProductVO(1007, "pepper", 2000, null, 11, null, "pepper.jpg");
		ProductVO prod = new ProductVO(1007, "pepper", 2000, 11, "jpg");
		try {
			biz.modify(prod);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
