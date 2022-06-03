package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.vo.ProductVO;

@SpringBootTest
class ProductTests {

	@Test
	void contextLoads() {
		ProductVO product = new ProductVO(20, "test", 50000, "2022-05-30", 5.8);
		System.out.println(product);
		System.out.println(product.getName());
	}

}