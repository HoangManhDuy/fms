package com.project.fms.service.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;

import com.project.fms.model.Account;
import com.project.fms.service.AccountService;

public class AccountServiceImpl extends BaseServiceImpl implements AccountService {
	private static final Logger logger = Logger.getLogger(AccountServiceImpl.class);

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
