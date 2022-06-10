package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.biz.ProductBiz;
import com.multi.frame.Util;
import com.multi.vo.CateVO;
import com.multi.vo.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductBiz biz;
	
	@Autowired
	CateBiz cbiz;
	
	@RequestMapping("/add")
	public String add(Model m) {
		List<CateVO> list = null;
		try {
			list = cbiz.getchild();
			m.addAttribute("slist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		List<CateVO> list = null;
		try {
			obj = biz.get(id);
			list = cbiz.getchild();
			m.addAttribute("calist", list);
			m.addAttribute("p", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/detail");
		return "/index";
	}
	
	@RequestMapping("/update")
	public String update(Model m, ProductVO obj) {
		String imgname = obj.getMf().getOriginalFilename();
		obj.setImgname(imgname);
		try {
			biz.modify(obj);
			Util.saveFile(obj.getMf());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:select";
	}
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m, ProductVO obj) {
		// name, price, cid, mf(->imgname) 파일 이름만 꺼낸다, 파일은 static/img에 저장
		String imgname = obj.getMf().getOriginalFilename();		// file name
		obj.setImgname(imgname);	// imgname 변수에 String 넣기
		int id = 0;
		try {
			biz.register(obj);
			id = biz.getlastid();
			Util.saveFile(obj.getMf());		// 파일을 서버에 저장하는 모듈
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+id;
	}
	
	@RequestMapping("/delete")
	public String delete(int id, Model m) {
		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:detail?id="+id;
		}
		return "redirect:select";
	}
}
