package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@Controller
@RequestMapping("/prod")
public class ProductController {
	
	@Autowired
	ProductBiz biz;
	
	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left","prod/left");
		mv.addObject("center","prod/center");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView register(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left", "prod/left");
		mv.addObject("center", "prod/register");
		return mv;
	}
	
	@RequestMapping("/registerprod")
	public ModelAndView registerprod(ModelAndView mv, ProductVO obj) {
		try {
			biz.register(obj);
			mv.addObject("rprod", obj);
			mv.setViewName("main");
			mv.addObject("left", "prod/left");
			mv.addObject("center","prod/registerok");
		} catch (Exception e) {
			mv.addObject("center", "prod/registerfail");
		}
		return mv;
	}
	
	@RequestMapping("/get")
	public ModelAndView get(ModelAndView mv) {
		List<ProductVO> list = null;
		try {
			list = biz.get();
			mv.addObject("allprod", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left", "prod/left");
		mv.addObject("center", "prod/get");
		return mv;
	}
	
	@RequestMapping("/proddetail")
	public ModelAndView proddetail(ModelAndView mv, int id) {
		ProductVO p = null;
		try {
			p = biz.get(id);
			mv.addObject("dprod", p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left", "prod/left");
		mv.addObject("center", "prod/detail");
		return mv;
	}
	
	@RequestMapping("/produpdate")
	public ModelAndView produpdate(ModelAndView mv, int id) {
		ProductVO p = null;
		try {
			p = biz.get(id);
			mv.addObject("uprod", p);
		} catch (Exception e) {
			e.printStackTrace();
		};
		mv.setViewName("main");
		mv.addObject("left", "prod/left");
		mv.addObject("center", "prod/update");
		return mv;
	}
	
	@RequestMapping("/produpdateimpl")
	public ModelAndView	produpdateimpl(ModelAndView mv,ProductVO obj) {
		List<ProductVO> list = null;
		try {
			biz.modify(obj);
			list = biz.get();
			mv.addObject("allprod", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left", "prod/left");
		mv.addObject("center","prod/get");
		return mv;
	}
	
	@RequestMapping("/proddelete")
	public ModelAndView proddelete(ModelAndView mv, int id) {
		List<ProductVO> list = null;
		try {
			biz.remove(id);
			list = biz.get();
			mv.addObject("allprod", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("main");
		mv.addObject("left","prod/left");
		mv.addObject("center", "prod/get");
		return mv;
	}
}
