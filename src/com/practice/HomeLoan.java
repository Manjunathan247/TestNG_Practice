package com.practice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {

	@Test(groups= {"webpage"})
	public void webLogin() {
		System.out.println("webLogin - HomeLoan");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileLogin(String url) {
		System.out.println("mobileLogin - HomeLoan");
		System.out.println(url);
	}

	@BeforeTest
	public void beforetestMethod() {
		System.out.println("It will execute firts");
	}

	@Test
	public void apiLogin() {
		System.out.println("apiLogin - HomeLoan");
	}
}
