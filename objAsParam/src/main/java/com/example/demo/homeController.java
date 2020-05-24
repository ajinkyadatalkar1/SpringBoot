package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {

	@RequestMapping("home")
	public ModelAndView home(alien obj) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", obj);
		mv.setViewName("home.jsp");
		return mv;
	}
}
