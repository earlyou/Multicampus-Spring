package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@Controller
@RequestMapping("/cate")
public class CateController {
	
	@Autowired
	CateBiz biz;
	
	@RequestMapping("/add")
	public String add(Model m) {
		List<CateVO> list = null;
		try {
			list = biz.getmain();
			m.addAttribute("calist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center","cate/add");
		return "/index";
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<CateVO> list = null;
		try {
			list = biz.get();
			m.addAttribute("calist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cate/select");
		return "/index";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, int id) {
		CateVO obj = null;
		List<CateVO> list = null;
		try {
			obj = biz.get(id);
			list = biz.getmain();
			m.addAttribute("calist", list);
			m.addAttribute("ca", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cate/detail");
		return "/index";
	}
	
	@RequestMapping("/update")
	public String update(Model m, CateVO obj) {
		try {
			biz.modify(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+obj.getId();
	}
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m, CateVO obj) {
		try {
			biz.register(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+obj.getId();
	}
}
