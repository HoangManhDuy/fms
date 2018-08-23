package com.project.fms.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.fms.model.Account;
import com.project.fms.service.AccountService;
import com.project.fms.service.impl.AccountServiceImpl;

@Controller
public class LoginController {
	private static Logger logger = Logger.getLogger(AccountServiceImpl.class);

	@Autowired
	private AccountService accountService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView model = new ModelAndView();

		model.setViewName("login");
		return model;
	}

	@RequestMapping(value = { "/" }, method = RequestMethod.POST)
	public String executeLogin(Model model, HttpServletRequest request, @RequestParam String email,
			@RequestParam String password) {
		try {
			boolean check_account = accountService.checkAccount(email, password);
			if (check_account) {
				int checkRole = accountService.findByEmail(email).getRole();
				if (checkRole != 1)
					return "redirect:/home";
				else
					return "redirect:/adminHome";
			}

		} catch (Exception e) {
			logger.error("login Controller - executeLogin:", e);
		}

		model.addAttribute("message", "Invalid credentials!!");

		return "login";
	}

}
