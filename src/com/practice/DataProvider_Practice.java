package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Practice {
	
	@Test(dataProvider="data")
	public void login(String userName,String password)
	{
		System.out.println("Login");
		System.out.println(userName+" , "+password);
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "user1";
		data[0][1] = "pwd1";
		data[1][0] = "user2";
		data[1][1] = "pwd2";
		data[2][0] = "user3";
		data[2][1] = "pwd3";
		return data;
	}

}
