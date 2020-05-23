package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
	
	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		String name = req.getParameter("name");
		System.out.println("Controller called!");
		req.setAttribute("val", "33");
		return "home";
	}
	
	@RequestMapping("responsebody")
	@ResponseBody
	public String body(HttpServletRequest req) 
	{
		String name = req.getParameter("name");
		System.out.println(name);
		req.setAttribute("val", "33");
		return "This is the body of the page returned by a method! " + name;
	}
	
	
}
