package com.project.fms.delegate;

import java.sql.SQLException;

import com.project.fms.service.AccountService;

public class LoginDelegate {
	private AccountService accountService;

	public AccountService getAccountService() {
		return accountService;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

	public boolean isValidateAccount(String email, String password) throws SQLException {
		return accountService.isValidateAccount(email, password);
	}
}
