package com.qa.application;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.application.App;

public class JSONConverter {
	public static String convertPerson(Account incomingAccount) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String JsonString = mapper.writeValueAsString(incomingAccount);
		System.out.println(JsonString);
		return JsonString;
	}

}
