package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cust")
public class CustController {
	
	@RequestMapping("/select")
	public String select(Model m) {
		m.addAttribute("center", "cust/select");
		return "/index";
	}
}
