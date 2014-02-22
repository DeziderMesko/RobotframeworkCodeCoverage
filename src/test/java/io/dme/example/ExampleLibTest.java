package io.dme.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleLibTest {

	@DataProvider(name = "nullParams")
	private Object[][] nullParams() {
		return new Object[][] { { null, 456 }, { null, null }, { 123, null } };
	}

	@Test(dataProvider = "nullParams")
	public void add(Integer first, Integer second) {
		ExampleLib el = new ExampleLib();
		Assert.assertNull(el.add(first, second));
	}
}
