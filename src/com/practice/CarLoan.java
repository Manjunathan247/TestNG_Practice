package com.practice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class CarLoan {

	@Test(groups={"webpage"})
	public void webLogin() {
		System.out.println("webLogin - CarLoan");
	}

	@Test
	public void mobileLogin() {
		System.out.println("mobileLogin - CarLoan");
	}

	@AfterTest
	public void afterTestMethod() {
		System.out.println("It will execute last");
	}

	@Test
	public void apiLogin() {
		System.out.println("apiLogin - CarLoan");
	}

}
