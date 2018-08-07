package com.project.fms.service.impl;

import com.project.fms.dao.AccountDAO;

public class BaseServiceImpl {
	protected AccountDAO accountDAO;

	public AccountDAO getAccountDAO() {
		return accountDAO;
	}

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
}
