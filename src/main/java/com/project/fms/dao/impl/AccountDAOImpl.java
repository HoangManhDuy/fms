package com.project.fms.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;

import com.project.fms.dao.AccountDAO;
import com.project.fms.dao.GenericDAO;
import com.project.fms.model.Account;

public class AccountDAOImpl extends GenericDAO<Integer, Account> implements AccountDAO {
	private static final Logger logger = Logger.getLogger(AccountDAOImpl.class);

	public AccountDAOImpl() {
		super(Account.class);
	}

	public AccountDAOImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	@Override
	public Account findByEmail(String email) {
		logger.info("email: " + email);
		return (Account) getSession().createQuery("FROM Account WHERE email = ?").setParameter(0, email);
	}

	@Override
	public List<Account> searchAccountUsingCretial(String name, int gender) {
		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<Account> cr = builder.createQuery(Account.class);
		Root<Account> root = cr.from(Account.class);
		cr.select(root);

		Predicate nameRestriction = builder.and(builder.like(root.get("name"), "%" + name + "%"));
		Predicate genderRestriction = builder.and(builder.equal(root.get("gender"), gender));

		cr.where(nameRestriction, genderRestriction);
		return getSession().createQuery(cr).getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> loadAccounts() {
		return getSession().createQuery("FROM Account").getResultList();
	}
	
}
