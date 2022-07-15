package com.ncp.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ncp.vo.Msg;

@Component
public class Scheduler {
	@Autowired
	private SimpMessageSendingOperations messagingTemplate;

	
    @Scheduled(cron = "*/15 * * * * *")	// every 15 seconds
    public void cronJobDailyUpdate() {
    	
    	System.out.println("----------- Scheduler ------------");
    	Msg msg = new Msg();
    	Random r = new Random();
    	int data = r.nextInt(100);	// data에 랜덤 숫자를 넣어서
    	int data2 = r.nextInt(100);
    	msg.setContent1("Server Message1:"+data);	// 메시지에 data를 담아
    	msg.setContent2("Server Message2:"+data2);
    	messagingTemplate.convertAndSend("/send/serversend", msg);	// 웹 소켓에 메시지 보내기
    }

    @Scheduled(cron = "1 0 0 1,8,15,22 * *")	// every day
    public void cronJobWeeklyUpdate(){

    }


}