package com.ncp;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ncp.restapi.Chatbot;



@SpringBootTest
class ChatbotTest {
	
	@Autowired
	Chatbot chatbot;
	
	@Test
	void contextLoads() throws IOException {
		String txt = "파파고랑 친해";
		String result = "";
		result = chatbot.getMessage(txt);
		System.out.println(result);
	}
	
	
}
