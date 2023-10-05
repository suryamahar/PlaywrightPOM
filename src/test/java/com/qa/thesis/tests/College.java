package com.qa.thesis.tests;

import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;
import com.qa.thesis.base.RetryAnalyzer;
import com.qa.thesis.factory.PlaywrightFactory;
import com.qa.thesis.pages.LoginPage;

public class College extends BaseTest{
	
	
	@Test(groups = "regression")
	public void CreateCollege() {
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToCollege();
		loginpage.AddCollege("College1");
	}
	@Test(groups = "regression", retryAnalyzer = RetryAnalyzer.class)
	public void DeleteCollege() {
		
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToCollege();
		loginpage.DeleteCollege("College1");
	} 

}
