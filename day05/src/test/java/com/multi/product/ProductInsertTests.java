package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductInsertTests {

	@Autowired
	ProductBiz biz;	// 굉장히 간단해진 코드
	
	@Test
	void contextLoads() {
		ProductVO p = new ProductVO(0,"test",50000,null, 5.8);
		try {
			biz.register(p);
			System.out.println("Registered OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}