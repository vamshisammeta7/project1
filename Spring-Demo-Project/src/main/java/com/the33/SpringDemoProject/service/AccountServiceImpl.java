package com.the33.SpringDemoProject.service;

import java.util.List;
import java.util.Objects;


import com.the33.SpringDemoProject.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.the33.SpringDemoProject.entity.Account;



@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountRepository accountrepo;



	@Override
	public Account saveAccount(Account account) {
	
	 return accountrepo.save(account);
	}

	@Override
	public List<Account> getAccounts() {
		// TODO Auto-generated method stub
		return accountrepo.findAll();
	}

	@Override
	public Account getAccountById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccountById(Long accountid) {
		// TODO Auto-generated method stub
		return accountrepo.findById(accountid).get();
	}

	//@Override
	//public Account getAccountByName(String accountname) {
		// TODO Auto-generated method stub
	//	return accountrepo.findByName(accountname);
	//}

	@Override
	public void removeAccountById(Long accountid) {
		// TODO Auto-generated method stub
		accountrepo.deleteById(accountid);
	}
	
	@Override
    public Account updateAccount(Long accountid, Account account) {
		// TODO Auto-generated method stub
		Account db  = accountrepo.findById(accountid).get();
		if(Objects.nonNull(account.getName()) ){
			
	  	db.setName(account.getName());
			
		}
		if(Objects.nonNull(account.getGender()) ){
			
		  	db.setGender(account.getGender());
				
			}
		if(Objects.nonNull(account.getAge()) ){
			
		  	db.setAge(account.getAge());
				
			}
		return accountrepo.save(db);
		
	}

	

	
	

}
