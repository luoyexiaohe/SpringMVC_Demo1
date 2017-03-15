package com.zc.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/c/")
public class C {
	
	@RequestMapping(value="cIf.do")
	public static String cIf(HttpServletRequest request,HttpServletResponse response,ModelMap model){
		model.addAttribute("msg", "Hello World !");
		return "c";
	}
}
