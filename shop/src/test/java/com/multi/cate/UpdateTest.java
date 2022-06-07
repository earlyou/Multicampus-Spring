package com.multi.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		CateVO cate = new CateVO(12, "black", 10);
		try {
			biz.modify(cate);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
