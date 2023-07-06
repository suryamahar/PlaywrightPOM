package com.qa.thesis.tests;

import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;
import com.qa.thesis.factory.PlaywrightFactory;
import com.qa.thesis.pages.LoginPage;

public class HoldType extends BaseTest{
	
	
	@Test(groups = "smoke")
	public void CreateHoldType() {
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToHoldType();
		loginpage.AddHoldType("HoldType1");
	}
	@Test(groups = "smoke")
	public void DeletHoldType() {
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.NavigateToHoldType();
		loginpage.DeleteHoldType("HoldType1");
	}

}
