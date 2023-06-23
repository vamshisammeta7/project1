package com.the33.SpringDemoProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.the33.SpringDemoProject.entity.Account;
import com.the33.SpringDemoProject.service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	private AccountService accountservice;
	
	@PostMapping("/accounts")
	public  Account saveAccount(@RequestBody Account account) {
		
		return accountservice.saveAccount(account);
	}
		
		@GetMapping("/accounts")
    public List<Account> getAccounts(){
		
			return accountservice.getAccounts();
		
		
		
		
		
	}
		@GetMapping("/accounts/{id}")
		public Account getAccountById(@PathVariable("id") Long accountid) {
			return accountservice.getAccountById(accountid);
			
		}
	//	@GetMapping("/accounts/{name}")
	//	public Account getAccountByName(@PathVariable("name") String accountname) {
	//		return accountservice.getAccountByName(accountname);
			
			
	//	}
		@DeleteMapping("/accounts/{id}")
		public String removeAccountById(@PathVariable("id") Long accountid) {
		 accountservice.removeAccountById(accountid);
		 return " removal success";
			
			
		}
		@PutMapping("/accounts/{id}")
		public Account updateAccount(@PathVariable("id") Long accountid,@RequestBody Account account) {
			
			return accountservice.updateAccount(accountid,account);
			
			
		}
		
	
	

}
