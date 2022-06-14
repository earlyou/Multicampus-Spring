package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@RestController
public class AjaxController {
	@Autowired
	CustBiz cbiz;
	
	@RequestMapping("checkid")
	public String checkid(String id) {
		String result = "";
		CustVO obj = null;
		try {
			obj = cbiz.get(id);
			if (obj == null) {
				result = "0";	// 정상
			} else {
				result = "1";	// 중복 아이디
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
