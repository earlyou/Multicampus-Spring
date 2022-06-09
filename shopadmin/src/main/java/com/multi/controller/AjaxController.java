package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.biz.CateBiz;
import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CateVO;
import com.multi.vo.CustVO;

@RestController
public class AjaxController {
	
	@Autowired
	CustBiz cbiz;
	
	@Autowired
	ProductBiz pbiz;
	
	@Autowired
	CateBiz cabiz;
	
	// cust/add
	@RequestMapping("checkid")
	public String checkid(String id) {
		String result = "";
		CustVO o = null;
		try {
			o = cbiz.get(id);
			if (o == null) {
				result = "0";
			} else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// product/add
	@RequestMapping("checkcid")
	public String checkcid(int cid) {
		String result = "";
		List<CateVO> list = null;
		try {
			list = cabiz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (CateVO o : list) {
			if (o.getId() == cid) {
				result = "0";
				return result;
			} else {
				result = "1";
			}
		}
		return result;
	}
	
	// cate/add
	@RequestMapping("checkcateid")
	public String checkcateid(int id) {
		String result = "";
		CateVO o = null;
		try {
			o = cabiz.get(id);
			if (o == null) {
				result = "0";
			} else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
