package com.project.fms.service;

import java.util.List;

import com.project.fms.model.Subject;

public interface SubjectService {
	
	List<Subject> loadSubjects(Integer offset, Integer maxResults);
	public Long count();
}
