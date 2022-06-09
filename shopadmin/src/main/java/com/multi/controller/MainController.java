package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.MainBiz;

@Controller
public class MainController {
	
	@Autowired
	MainBiz biz;
	
	@RequestMapping("/")
	public String main(Model m) {
		int ccnt = 0;
		int pcnt = 0;
		try {
			ccnt = biz.getCustCnt();
			pcnt = biz.getProductCnt();
			m.addAttribute("ccnt", ccnt);
			m.addAttribute("pcnt", pcnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "index";
	}
}
