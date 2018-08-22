package com.project.fms.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.fms.model.Subject;
import com.project.fms.service.SubjectService;

@Controller
public class SearchController {
	private static final Logger logger = Logger.getLogger(SearchController.class);
	
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping(value="/searchResults", method = RequestMethod.GET)
	public ModelAndView showSearchResult() {		
	
		ModelAndView model = new ModelAndView("subject-search");
		return model;
	}

	@RequestMapping(value="/searchResults", method = RequestMethod.POST)
	public String searchResult(Model model, @RequestParam String keyword) {
		logger.info("detail student");
		
		List<Subject> subject = subjectService.findByKeyword(keyword);
		model.addAttribute("searchResults", subject);
		model.addAttribute("keyword", keyword);
		
		return "subject-search";
	}
}
