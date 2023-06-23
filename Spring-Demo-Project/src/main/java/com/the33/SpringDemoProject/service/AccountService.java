package com.the33.SpringDemoProject.service;

import java.util.List;
import com.the33.SpringDemoProject.entity.Account;

public interface AccountService {

	public Account saveAccount(Account account);

	public List<Account> getAccounts();

	public Account getAccountById();

	public Account getAccountById(Long accountid);

	

	public void removeAccountById(Long accountid);



	public Account updateAccount(Long accountid, Account account);

	
	
	

}
