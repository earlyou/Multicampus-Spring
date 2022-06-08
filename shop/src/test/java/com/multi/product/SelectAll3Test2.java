package com.multi.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductAVGVO;

@SpringBootTest
class SelectAll3Test2 {

	@Autowired
	ProductBiz biz;
	
	@Test
	void contextLoads() {
		List<ProductAVGVO> list = null;
		try {
			list = biz.get3();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (ProductAVGVO productAVGVO : list) {
			System.out.println(productAVGVO);
		}
	}

}
