package com.qa.thesis.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;
import com.qa.thesis.factory.PlaywrightFactory;
import com.qa.thesis.pages.LoginPage;

public class Login extends BaseTest {
	
	@Test
	public void validLogin() {
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		Assert.assertTrue(loginpage.IsAgreeButtonVisible(), "Agree button is not available");
	}
	@Test
	public void invalidLogin() {
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd");
		Assert.assertFalse(loginpage.IsAgreeButtonVisible(), "Agree button is not available");
		loginpage.clickAgree();

	}


}
