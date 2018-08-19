package com.project.fms.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.fms.service.AccountService;
import com.project.fms.service.impl.AccountServiceImpl;

@Controller
public class LoginController {
	private static Logger logger = Logger.getLogger(AccountServiceImpl.class);
	
	@Autowired
	private AccountService accountService;

	@RequestMapping(value = { "/" }, method = RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, @RequestParam String email,
			@RequestParam String password) {
		ModelAndView model = null;
		try {
			boolean check_account = accountService.checkAccount(email, password);
			if (check_account)
				model = new ModelAndView("home");
			else {
				model = new ModelAndView("login");

				request.setAttribute("message", "Invalid credentials!!");
			}
		} catch (Exception e) {
			logger.error("login Controller - executeLogin:", e);
		}
		return model;
	}

}
