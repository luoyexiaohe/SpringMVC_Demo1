package com.zc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/mine/")
public class Mine {
	public Mine(){
		int a = 5;
		int b = 10;
		int c = a+b;
		System.out.println(c);
	}
	@RequestMapping(value="mine.do")
	public String mine(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		model.addAttribute("msg", "Hello World !");
		return "mine";
	}
	@RequestMapping(value="mineTest.do")
	public String mineTest(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		model.addAttribute("msg", "Hello JAVA !");
		return "mine";
	}
}
