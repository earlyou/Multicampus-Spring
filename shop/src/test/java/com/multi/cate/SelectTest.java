package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class SelectTest {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		CateVO cate = null;
		try {
			cate = biz.get(11);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(cate);
	}

}
