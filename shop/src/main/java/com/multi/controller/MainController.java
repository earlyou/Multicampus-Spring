package com.multi.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CartBiz;
import com.multi.biz.CateBiz;
import com.multi.biz.CustBiz;
import com.multi.biz.ProductBiz;
import com.multi.vo.CartVO;
import com.multi.vo.CateVO;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@Controller
public class MainController {
	
	@Autowired
	CustBiz cbiz;
	
	@Autowired
	CateBiz catebiz;
	
	@Autowired
	ProductBiz pbiz;
	
	@Autowired
	CartBiz cartbiz;
	
	// always return catelist
	@ModelAttribute("catelist")
	public List<CateVO> makemenu(){
		List<CateVO> catelist = null;
		try {
			catelist = catebiz.getmain();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return catelist;
	}
	
	// -> main.html
	@RequestMapping("/")
	public String main(Model m) {
		return "main";
	}
	
	// -> login.html
	@RequestMapping("/login")
	public String login(Model m, String msg) {
		if (msg != null && msg.equals("f")) {
			m.addAttribute("msg", "아이디 혹은 비밀번호가 틀렸습니다.");
		}
		m.addAttribute("center", "login");
		return "main";
	}
	
	// login.html
	@RequestMapping("loginimpl")
	public String loginimpl(Model m, CustVO obj, HttpSession session) {
		CustVO cust = null;
		try {
			cust = cbiz.get(obj.getId());
			if (cust == null) {
				throw new Exception();
			}
			if (cust.getPwd().equals(obj.getPwd())) {
				session.setAttribute("logincust", cust);
			}else {
				throw new Exception();
			}
		} catch (Exception e) {
			return "redirect:/login?msg=f";
		}
		m.addAttribute("c", cust);
		return "main";
	}
	
	// -> register.html
	@RequestMapping("/register")
	public String register(Model m) {
		m.addAttribute("center", "register");
		return "main";
	}
	
	// register.html
	@RequestMapping("/registerimpl")
	public String registerimpl(Model m, CustVO obj, HttpSession session) {
		try {
			cbiz.register(obj);
			session.setAttribute("logincust", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}
	
	// -> main.html
	@RequestMapping("/logout")
	public String logout(Model m, HttpSession session) {
		if (session != null) {
			session.invalidate();
		}
		return "main";
	}
	
	// main.html -> left.html
	@RequestMapping("/getcate")
	public String getcate(Model m, int id) {
		List<CateVO> catelist = null;
		try {
			catelist = catebiz.selectsub(id);
			m.addAttribute("leftcatelist", catelist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}
	
	// left.html -> product.html
	@RequestMapping("getproduct")
	public String getproduct(Model m, int id, String name) {
		List<ProductVO> plist = null;
		try {
			plist = pbiz.selectproduct(id);
			m.addAttribute("center", "product");
			m.addAttribute("menu", name);
			m.addAttribute("plist", plist);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "main";
	}
	
	// main.html -> cart.html
	@RequestMapping("/cart")
	public String cart(Model m) {
		List<CartVO> list = null;
		try {
			list = cartbiz.get();
			m.addAttribute("cartlist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cart");
		return "main";
	}
}
