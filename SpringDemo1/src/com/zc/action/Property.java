package com.zc.action;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/property/")
public class Property {
    
    @RequestMapping(value="read.do")
    public static String read(HttpServletRequest request,HttpServletResponse response,ModelMap model){
        //model.addAttribute("msg", "Hello World !");
        ResourceBundle rb = ResourceBundle.getBundle("cfg", Locale.ENGLISH);
        String msg = rb.getString("msg");
        model.addAttribute("msg",msg);
        return "property";
    }
}
