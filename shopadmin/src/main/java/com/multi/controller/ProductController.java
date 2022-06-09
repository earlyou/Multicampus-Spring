package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductBiz biz;
	
	@RequestMapping("/add")
	public String add(Model m) {
		m.addAttribute("center", "product/add");
		return "/index";
	}
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<ProductVO> list = null;
		try {
			list = biz.get2();
			m.addAttribute("plist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/select");
		return "/index";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, int id) {
		ProductVO obj = null;
		try {
			obj = biz.get(id);
			m.addAttribute("p", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/detail");
		return "/index";
	}
	
	@RequestMapping("/update")
	public String update(Model m, ProductVO obj) {
		try {
			biz.modify(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+obj.getId();
	}
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m, ProductVO obj) {
		int id = 0;
		try {
			biz.register(obj);
			id = biz.getlastid();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+id;
	}
}
