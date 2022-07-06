package com.ncp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ncp.restapi.NaverAPI;

@SpringBootTest
class PAPAGOTest {

	@Autowired
	NaverAPI naverapi;
	
	@Test
	void contextLoads() {
		String txt = "밥은 먹고 다니니";
		naverapi.papago(txt);
	}
}
