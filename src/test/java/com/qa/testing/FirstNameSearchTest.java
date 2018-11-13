package com.qa.testing;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class FirstNameSearchTest {

	@Test
	public void findNametest() {
		String name = "Ross";
		Assert.assertEquals(1,findName(name));
	}

}
