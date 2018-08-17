package com.project.fms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.fms.bean.AccountBean;
import com.project.fms.delegate.LoginDelegate;

@Controller
public class LoginController {
	@Autowired
	private LoginDelegate loginDelegate;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		ModelAndView model = new ModelAndView();

		if (error != null) {
			model.addObject("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			model.addObject("message", "Logged out from JournalDEV successfully.");
		}

		model.setViewName("login");
		return model;
	}

	@RequestMapping(value = { "/" }, method = RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("accountBean") AccountBean accountBean) {
		ModelAndView model = null;
		try {
			boolean isValidAccount = loginDelegate.isValidateAccount(accountBean.getEmail(), accountBean.getPassword());
			if (isValidAccount) {
				model = new ModelAndView("home");
			} else {
				model = new ModelAndView("login");

				model.addObject("loginBean", accountBean);
				request.setAttribute("message", "Invalid credentials!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

}
