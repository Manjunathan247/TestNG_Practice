package com.practice;

import org.testng.annotations.Test;

public class PersonalLoan {
	@Test(groups = { "webpage" })
	public void webLogin() {
		System.out.println("webLogin - PersonalLoan");
	}

	@Test
	public void mobileLogin() {
		System.out.println("mobileLogin - PersonalLoan");
	}

	@Test
	public void apiLogin() {
		System.out.println("apiLogin - PersonalLoan");
	}
}
