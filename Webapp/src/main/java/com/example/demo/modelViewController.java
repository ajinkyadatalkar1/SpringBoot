package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class modelViewController {
	@RequestMapping("mvc")
	public ModelAndView mvc(@RequestParam("name") String myName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("myName", myName);
		mv.setViewName("modelview");
		return mv;
	}
}
