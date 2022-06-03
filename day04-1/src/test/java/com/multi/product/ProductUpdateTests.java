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
		ProductVO product = new ProductVO(9, "test", 50000, "2022-05-30", 5.8);
		try {
			biz.modify(product);
			System.out.println(biz.get(9));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}