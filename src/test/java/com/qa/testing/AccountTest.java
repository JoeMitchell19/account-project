package com.qa.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.application.Account;
import com.qa.application.Service;

public class AccountTest {

	@Test
	public void test() {
		Account ac = new Account();
		assertEquals(null,ac.getFirstName());
		ac.setFirstName("John");
		ac.setLastName("Tran");
		ac.setAccountNumber(1);
		assertEquals("John",ac.getFirstName());
		assertEquals("Tran",ac.getLastName());
		assertEquals(1,ac.getAccountNumber());
		Service s = new Service();
		s.addNewAccount("Dave","Jones",1);
		Account a = s.findAccount(1);
		assertEquals("Dave", a.getFirstName());
		

}
}
