package com.qa.application;

import com.fasterxml.jackson.core.JsonProcessingException;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World to the Standard out");
		Service inputData = new Service();
		inputData.addNewAccount("Joe","Mitchell",1);
		inputData.addNewAccount("Brad","Hudson-Grant",2);
		inputData.addNewAccount("Kayode","Zollner",3);
		inputData.addNewAccount("Herve","Malila",4);
		inputData.addNewAccount("Ross","Lawrence",5);
		inputData.addNewAccount("John","Gordon",6);
		
		Account accountSearchedFor = inputData.findAccount(3);
		App ap = new App();
		ap.printInfo(accountSearchedFor);
		JSONConverter json = new JSONConverter();
		try {
			json.convertPerson(accountSearchedFor);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	public void printInfo(Account person) {
		System.out.println("First Name: " +person.getFirstName());
		System.out.println("Last Name: "+person.getLastName());
		System.out.println("Account Number: " +person.getAccountNumber());

}
}
