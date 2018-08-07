package com.project.fms.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.sql.DataSource;

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

	DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
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

	@Override
	public boolean isValidateAccount(String email, String password) throws SQLException {
		String query = "select count(1) from accounts where email = ? and password = ?";
		PreparedStatement pst = dataSource.getConnection().prepareStatement(query);
		pst.setString(1, email);
		pst.setString(2, password);
		ResultSet resultSet = pst.executeQuery();
		if (resultSet.next())
			return (resultSet.getInt(1) > 0);
		else
			return false;
	}

}
