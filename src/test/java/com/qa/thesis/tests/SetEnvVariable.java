package com.qa.thesis.tests;

import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;
import com.qa.thesis.base.RetryAnalyzer;
import com.qa.thesis.factory.PlaywrightFactory;
import com.qa.thesis.pages.LoginPage;

public class SetEnvVariable extends BaseTest{
	
	
	@Test()
	public void SetDropCharge() {
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToApplicationSetting();
		loginpage.GoToModule();
		loginpage.SetDropCharges("Dropped");
	}
}