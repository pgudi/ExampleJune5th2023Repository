package com.sgtesting.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testing {
	
	@Test(dataProvider = "testdata")
	public void testcase1(String user,String password)
	{
		System.out.println(user+"  --->  "+password);
	}
	
	
	@DataProvider(name = "testdata")
	public Object[][] getData()
	{
		return new Object[][] {{"user1","Welcome1"},{"user2","Welcome2"}};
	}
	

}
