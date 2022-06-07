package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustSelectTests {
	
	@Autowired
	CustBiz biz;

	@Test
	void contextLoads() {
		CustVO cust = null;
		try {
			cust = biz.get("id04");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(cust);
	}

}





