package com.project.fms.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.project.fms.dao.AccountDAO;
import com.project.fms.dao.GenericDAO;
import com.project.fms.model.Account;

public class AccountDAOImpl extends GenericDAO<Integer, Account> implements AccountDAO {
	public AccountDAOImpl() {
		super(Account.class);
	}

	public AccountDAOImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Account findByEmail(String email) {
		Criteria criteria = getSession().createCriteria(Account.class);
		criteria.add(Restrictions.eq("email", email));

		return (Account) criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> loadAccounts() {
		return getSession().createQuery("FROM Account").getResultList();
	}
}
