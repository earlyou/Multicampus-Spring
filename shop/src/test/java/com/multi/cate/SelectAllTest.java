package com.multi.cate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@SpringBootTest
class SelectAllTest {

	@Autowired
	CateBiz biz;
	
	@Test
	void contextLoads() {
		List<CateVO> list = null;
		try {
			list = biz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (CateVO cateVO : list) {
			System.out.println(cateVO);
		}
	}

}
