package com.project.fms.service;

import java.util.List;

import com.project.fms.model.Account;

public interface AccountService extends BaseService<Integer, Account> {
	boolean deleteAccount(Integer id);

	Account findByEmail(String email);

	boolean checkAccount(String email, String password);

	List<Account> loadAccounts();
}
