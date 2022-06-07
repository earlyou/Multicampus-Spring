package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.vo.ProductVO;

@SpringBootTest
class ProductTests {

	@Test
	void contextLoads() {
		ProductVO obj = new ProductVO(0, "nintendo", 340000, null, 0.4);
		System.out.println(obj);
		System.out.println(obj.getName());
	}

}
