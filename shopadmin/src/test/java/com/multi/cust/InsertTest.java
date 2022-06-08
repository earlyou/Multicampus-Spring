package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class InsertTest {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO cust = new CustVO("id05", "name05", "England", "pwd05");
		try {
			biz.register(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}