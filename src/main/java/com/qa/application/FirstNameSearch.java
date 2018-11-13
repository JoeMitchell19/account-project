package com.qa.application;

import java.util.HashMap;
import java.util.stream.Collectors;

public class FirstNameSearch {
	HashMap<Integer, Account> map;

	public FirstNameSearch(HashMap<Integer, Account> hashMap) {
		map = hashMap;
	}

	public int FirstNameCount(String chosenName) {
		return map.entrySet().stream().filter(e -> chosenName.equals(e.getValue().getFirstName()))
				.collect(Collectors.toList()).size();
	}

}
