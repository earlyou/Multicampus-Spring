package com.multi.main;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.MainBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
class ProductSearchTest {

	@Autowired
	MainBiz biz;
	
	@Test
	void contextLoads() {
		List<ProductVO> list = null;
		try {
			list = biz.searchProduct("pa");
			for (ProductVO productVO : list) {
				System.out.println(productVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
