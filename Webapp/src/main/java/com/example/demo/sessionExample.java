package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sessionExample {
	@RequestMapping("sessioneg")
	/* 
	    public String example(HttpServletRequest req) {
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println(name);
		session.setAttribute("name", name);
		return "sessioneg"; 
		
	*/
	
	
	// This is also correct.
	/*
	public String example(HttpServletRequest req, HttpSession session) {
		// HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println(name);
		session.setAttribute("name", name);
		return "sessioneg";
	}
	
	*/
	
	//This is also correct
	public String example(String name, HttpSession session) {
		// HttpSession session = req.getSession();
		String myName = name;
		System.out.println(myName);
		session.setAttribute("name", myName);
		return "sessioneg";
	}
}
