package com.project.fms.service.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.project.fms.dao.AccountDAO;
import com.project.fms.model.Account;
import com.project.fms.service.AccountService;

public class AccountServiceImpl extends BaseServiceImpl implements AccountService {
	private static final Logger logger = Logger.getLogger(AccountServiceImpl.class);
	private AccountDAO accountDAO;

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	@Override
	public Account findById(Serializable key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account saveOrUpdate(Account entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(Account entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValidateAccount(String email, String password) throws SQLException {
		return accountDAO.isValidateAccount(email, password);
	}

	@Override
	public List<Account> searchAccounts(String name, int gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> loadAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

}
