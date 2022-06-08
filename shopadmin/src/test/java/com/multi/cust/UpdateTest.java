package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class UpdateTest {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO cust = new CustVO("id05", "Bill", "America", "bwd");
		try {
			biz.modify(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
