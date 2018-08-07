package com.project.fms.dao;

import java.util.List;

import com.project.fms.model.Account;

public interface AccountDAO extends BaseDAO<Integer, Account> {
	Account findByEmail(String email);

	List<Account> searchAccountUsingCretial(String name, int gender);

	List<Account> loadAccounts();
}
