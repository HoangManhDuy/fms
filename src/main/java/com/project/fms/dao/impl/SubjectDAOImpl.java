package com.project.fms.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

import com.project.fms.dao.GenericDAO;
import com.project.fms.dao.SubjectDAO;
import com.project.fms.model.Subject;

public class SubjectDAOImpl extends GenericDAO<Long, Subject> implements SubjectDAO {
	public SubjectDAOImpl() {
		super(Subject.class);
	}

	public SubjectDAOImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<Subject> loadSubjects(Integer offset, Integer maxResults) {
		return getSession().createCriteria(Subject.class)
				.setFirstResult(offset != null ? offset : 0)
				.setMaxResults(maxResults != null ? maxResults : 10)
				.list();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Long count() {
		return (Long)getSession()
                .createCriteria(Subject.class)
                .setProjection(Projections.rowCount())
                .uniqueResult();
	}

}
