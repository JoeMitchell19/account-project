package com.qa.application;

import java.util.HashMap;

public class Service {
	HashMap<Integer, Account> personhashmap = new HashMap<Integer, Account>();
	private int key = 1;

	public void addNewAccount(String firstName, String lastName, int accountNumber) {
		Account accountobj = new Account();
		accountobj.setFirstName(firstName);
		accountobj.setLastName(lastName);
		accountobj.setAccountNumber(accountNumber);
		personhashmap.put(key, accountobj);
		System.out.println("Account with Account Number " + accountNumber + " and key " + key + " has been created");
		key++;

	}

	public Account findAccount(int accountID) {
		Account retrievedAccount = personhashmap.get(accountID);
		return retrievedAccount;

	}
}
