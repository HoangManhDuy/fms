package com.project.fms.controller;

import java.util.Locale;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.fms.model.Account;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	SessionFactory sessionFactory;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Account account = new Account();
		account.setRole(0);
		account.setEmail("abc@gmail.com");
		account.setPassword("xxx");
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		session.save(account);
		
		session.getTransaction().commit();
		return "home";
	}

}
