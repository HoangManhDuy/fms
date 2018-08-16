package com.project.fms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public ModelAndView adminHomePage() {
		ModelAndView model = new ModelAndView();

		model.setViewName("admin-home");
		return model;
	}
}
