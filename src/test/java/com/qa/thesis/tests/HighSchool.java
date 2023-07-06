package com.qa.thesis.tests;

import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;
import com.qa.thesis.factory.PlaywrightFactory;
import com.qa.thesis.pages.LoginPage;

public class HighSchool extends BaseTest{
	
	
	@Test(groups = "regression")
	public void CreateHighSchool() {
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToHighSchool();
		loginpage.AddHighSchool("HighSchool1");
	}
	@Test(groups = "regression")
	public void DeleteHighSchool() {
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.NavigateToHighSchool();
		loginpage.DeleteHighSchool("HighSchool1");
	} 

}
