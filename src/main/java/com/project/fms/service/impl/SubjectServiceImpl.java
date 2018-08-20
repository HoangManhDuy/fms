package com.project.fms.service.impl;

import java.util.List;

import com.project.fms.dao.SubjectDAO;
import com.project.fms.model.Subject;
import com.project.fms.service.SubjectService;

public class SubjectServiceImpl implements SubjectService {
	private SubjectDAO subjectDAO;

	public SubjectDAO getSubjectDAO() {
		return subjectDAO;
	}

	public void setSubjectDAO(SubjectDAO subjectDAO) {
		this.subjectDAO = subjectDAO;
	}

	@Override
	public List<Subject> loadSubjects() {
		return subjectDAO.loadSubjects();
	}

}
