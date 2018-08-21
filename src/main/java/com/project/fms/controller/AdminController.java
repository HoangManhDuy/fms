package com.project.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.fms.model.Account;
import com.project.fms.model.Room;
import com.project.fms.model.Subject;
import com.project.fms.service.AccountService;
import com.project.fms.service.RoomService;
import com.project.fms.service.SubjectService;
import com.project.fms.taglib.PaginationTaglib;

@Controller
public class AdminController {
	@Autowired
	private AccountService accountService;
	@Autowired
	private RoomService roomService;
	@Autowired
	private SubjectService subjectService;	

	@RequestMapping(value = "/adminHome", method = RequestMethod.GET)
	public ModelAndView adminHomePage(Integer offset, Integer maxResult) {

		List<Account> students = accountService.loadAccounts();
		List<Room> rooms = roomService.loadRooms();
		List<Subject> subjects = subjectService.loadSubjects(offset, maxResult);
	
		ModelAndView model = new ModelAndView();
		
		model.addObject("student", students);
		model.addObject("room", rooms);
		model.addObject("subject", subjects);

		model.setViewName("admin-home");
		
		return model;
	}
	
	@RequestMapping(value = "/adminSubject/{offset}", method = RequestMethod.GET)
	public ModelAndView listSubject(@PathVariable int offset, Integer maxResults) {
		List<Subject> subjects = subjectService.loadSubjects(offset, maxResults);
		
		ModelAndView model = new ModelAndView();
		model.addObject("offset", offset);
		model.addObject("totalSubject", subjectService.count());
		model.addObject("subjects", subjects);
		
		model.setViewName("admin-subject");
		
		return model;
	}

}
