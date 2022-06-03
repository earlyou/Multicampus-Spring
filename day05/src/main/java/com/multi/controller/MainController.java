package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@Controller
public class MainController {
	
	@Autowired
	CustBiz biz;
	
	@Autowired
	ProductBiz pbiz;
	
	@RequestMapping("/")
	public String main() {
		return "main";
	}
	
	@RequestMapping("/custadd")
	public String custadd() {
		return "custadd";
	}
	
	@RequestMapping("/chart")
	public String chart() {
		return "chart";
	}
	
	@RequestMapping("/custaddimpl")
	public ModelAndView custaddimpl(ModelAndView mv, CustVO cust) {
		String next = "custaddok";
		try {
			biz.register(cust);
			mv.addObject("rcust", cust);	// 성공시 "rcust"에 cust 모든 정보 넣기
		} catch (Exception e) {
			next = "custaddfail";	// Exception발생시 custaddfail로 이동하도록 제어
		}
		mv.setViewName(next);
		return mv;
	}
	
	@RequestMapping("/custselect")
	public ModelAndView custselect(ModelAndView mv) {
		List<CustVO> list = null;
		try {
			list = biz.get();
			mv.addObject("allcust", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("custselect");
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
		mv.setViewName("custdetail");
		return mv;
	}
	
	@RequestMapping("/custdelete")
	public String custdelete(String id) {
		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:custselect";// redirect, custselect가 새로 요청되도록 한다
	}
	
	@RequestMapping("/custupdate")
	public ModelAndView custupdate(ModelAndView mv, String id) {
		CustVO cust = null;
		try {
			cust = biz.get(id);
			mv.addObject("ucust", cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("custupdate");
		return mv;
	}
	
	@RequestMapping("/custudpateimpl")
	public String custudpateimpl(CustVO cust) {
		try {
			biz.modify(cust);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:custdetail?id="+cust.getId();
	}
	
	// Product Table
	@RequestMapping("/productadd")
	public String productadd() {
		return "productadd";
	}
	
	@RequestMapping("/productselect")
	public ModelAndView productselect(ModelAndView mv) {
		List<ProductVO> list = null;
		try {
			list = pbiz.get();
			mv.addObject("allproduct", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("productselect");
		return mv;
	}
	
	@RequestMapping("/productdetail")
	public ModelAndView productdetail(ModelAndView mv, int id) {
		ProductVO product = null;
		try {
			product = pbiz.get(id);
			mv.addObject("dproduct", product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("productdetail");
		return mv;
	}
	
	@RequestMapping("/productdelete")
	public String productdelete(int id) {
		try {
			pbiz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:productselect";
	}
	
	@RequestMapping("/productupdate")
	public ModelAndView productupdate(ModelAndView mv, int id) {
		ProductVO product = null;
		try {
			product = pbiz.get(id);
			mv.addObject("uproduct",product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.setViewName("productupdate");
		return mv;
	}
	
	@RequestMapping("/productupdateimpl")
	public String productupdate(ProductVO product) {
		try {
			pbiz.modify(product);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:productdetail?id="+product.getId();
	}
	
	@RequestMapping("/productaddimpl")
	public ModelAndView productaddimpl(ModelAndView mv, ProductVO product) {
		String next = "productaddok";
		try {
			pbiz.register(product);
			mv.addObject("rproduct", product);
		} catch (Exception e) {
			next = "productaddfail";
		}
		mv.setViewName(next);
		return mv;
	}
}