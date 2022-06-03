package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustUpdateTests {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO cust = new CustVO("id22", "pwd202", "Eric");
		try {
			biz.modify(cust);
			System.out.println(biz.get("id22"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}