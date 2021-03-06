package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@Controller
@RequestMapping("/cust")
public class CustController {
	
	@Autowired
	CustBiz biz;
	
	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center","cust/center");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center","cust/register");
		return mv;
	}
	
	@RequestMapping("/registerimpl")
	public ModelAndView registerimpl(ModelAndView mv, CustVO obj) {
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		try {
			biz.register(obj);
			mv.addObject("center","cust/registerok");
			mv.addObject("rcust",obj);
		} catch (Exception e) {
			mv.addObject("center","cust/registerfail");
		}
		return mv;
	}
	
	@RequestMapping("/get")
	public ModelAndView get(ModelAndView mv) {
		List<CustVO> list = null;
		try {
			list = biz.get();
			mv.addObject("allcust", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center","cust/get");
		return mv;
	}
	
	@RequestMapping("/custdetail")
	public ModelAndView custdetail(ModelAndView mv, String id) {
		CustVO cust = null;
		try {
			cust = biz.get(id);
			mv.addObject("dcust", cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left","cust/left");
		mv.addObject("center","cust/detail");
		return mv;
	}
	
	@RequestMapping("/custupdate")
	public ModelAndView custupdate(ModelAndView mv, String id) {
		CustVO cust = null;
		try {
			cust= biz.get(id);
			mv.addObject("ucust", cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left", "cust/left");
		mv.addObject("center", "cust/update");
		return mv;
	}
	
	@RequestMapping("/custupdateimpl")
	public ModelAndView custupdateimpl(ModelAndView mv, CustVO obj) {
		List<CustVO> list = null;
		try {
			biz.modify(obj);
			list = biz.get();
			mv.addObject("allcust", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left", "cust/left");
		mv.addObject("center", "cust/get");
		return mv;
	}
	
	@RequestMapping("/custdelete")
	public ModelAndView custdelete(ModelAndView mv, String id) {
		List<CustVO> list = null;
		try {
			biz.remove(id);
			list = biz.get();
			mv.addObject("allcust", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left", "cust/left");
		mv.addObject("center", "cust/get");
		return mv;
	}
}
