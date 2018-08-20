package com.project.fms.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.project.fms.dao.GenericDAO;
import com.project.fms.dao.SubjectDAO;
import com.project.fms.model.Subject;

public class SubjectDAOImpl extends GenericDAO<Integer, Subject> implements SubjectDAO {
	public SubjectDAOImpl() {
		super(Subject.class);
	}

	public SubjectDAOImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Subject> loadSubjects() {
		return getSession().createQuery("FROM Subject").getResultList();
	}

}
