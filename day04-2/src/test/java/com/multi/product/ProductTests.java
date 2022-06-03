package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.vo.ProductVO;

@SpringBootTest
class ProductTests {

	@Test
	void contextLoads() {
		ProductVO product = new ProductVO(0, "test", 50000, null, 5.8);
		System.out.println(product);
		System.out.println(product.getName());
	}

}