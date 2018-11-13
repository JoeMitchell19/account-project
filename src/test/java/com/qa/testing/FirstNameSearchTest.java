package com.qa.testing;

import static org.junit.Assert.*;
import org.junit.Test;

import com.qa.application.FirstNameSearch;
import com.qa.application.Service;

public class FirstNameSearchTest {

	@Test
	public void findNametest() {
		Service service = new Service();
		service.addNewAccount("Ross","Lawrence",1);
		service.addNewAccount("Ross","Geller",2);
		FirstNameSearch fns = new FirstNameSearch(service.retrieveMap());
		assertEquals(2,fns.FirstNameCount("Ross"));
	}

}
