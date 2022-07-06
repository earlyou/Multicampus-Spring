package com.ncp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncp.restapi.KakaoAPI;
import com.ncp.restapi.NaverAPI;

@RestController
public class AjaxController {
	
	@Autowired
	KakaoAPI kakaoapi;
	
	@Autowired
	NaverAPI naverapi;
	
	// kakao.html
	@RequestMapping("kakaolocal")
	public Object kakaolocal(String keyword) throws Exception {
		Object result = kakaoapi.kakaolocalapi(keyword);
		return result;
	}
	
	// papago.html
	@RequestMapping("papagotr")
	public Object papagotr(String txt) throws Exception {
		Object obj = naverapi.papago(txt);
		return obj;
	}
}