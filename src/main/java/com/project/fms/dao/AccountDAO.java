package com.project.fms.dao;

import java.sql.SQLException;
import java.util.List;

import com.project.fms.model.Account;

public interface AccountDAO extends BaseDAO<Integer, Account> {
	Account findByEmail(String email);

	public boolean isValidateAccount(String email, String password) throws SQLException;

	List<Account> searchAccountUsingCretial(String name, int gender);

	List<Account> loadAccounts();
}
