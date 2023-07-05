package com.qa.thesis.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;

public class Login extends BaseTest {
	
	@Test(groups = "regression")
	public void validLogin() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		Assert.assertTrue(loginpage.IsAgreeButtonVisible(), "Agree button is not available");
	}
	@Test(groups = "smoke")
	public void invalidLogin() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd");
		Assert.assertFalse(loginpage.IsAgreeButtonVisible(), "Agree button is not available");
	}


}
