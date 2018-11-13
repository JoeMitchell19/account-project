package com.qa.testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qa.application.Account;
import com.qa.application.JSONConverter;

public class JSONConverterTest {

	@Test
	public void test() {
		Account a = new Account();
		a.setFirstName("Peter");
		a.setLastName("Kay");
		a.setAccountNumber(1);
		String output = "";
		try {
			output = JSONConverter.convertPerson(a);
		} 
		catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		assertEquals("{\"firstName\":\"Peter\",\"lastName\":\"Kay\",\"accountNumber\":1}",output);
	}
	

}
