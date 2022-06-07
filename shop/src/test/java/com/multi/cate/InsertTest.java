package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class InsertTest {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		CateVO cate = new CateVO(22, "long shirts", 20);
		try {
			biz.register(cate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
