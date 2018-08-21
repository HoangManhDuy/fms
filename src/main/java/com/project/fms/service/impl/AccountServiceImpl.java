package com.project.fms.service.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.project.fms.dao.AccountDAO;
import com.project.fms.model.Account;
import com.project.fms.service.AccountService;

public class AccountServiceImpl extends BaseServiceImpl implements AccountService {
	private static Logger logger = Logger.getLogger(AccountServiceImpl.class);

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
	public boolean checkAccount(String email, String password) {
		try {
			Account account = accountDAO.findByEmail(email);
			if (account == null || !password.equals(account.getPassword()))
				return false;
			else
				return true;
		} catch (Exception e) {
			logger.error("account findByEmail - execute: ", e);
			return false;
		}
	}

	@Override
	public List<Account> loadAccounts() {
		
		return accountDAO.loadAccounts();
	}

}
