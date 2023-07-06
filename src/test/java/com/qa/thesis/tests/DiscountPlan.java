package com.qa.thesis.tests;

import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;
import com.qa.thesis.factory.PlaywrightFactory;
import com.qa.thesis.pages.LoginPage;

public class DiscountPlan extends BaseTest{
	
	
	@Test(groups = "smoke")
	public void CreateDiscountPlan() {
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToDiscountPlan();
		loginpage.AddDiscountPlan("DiscountPlan1");
	}
	@Test(groups = "smoke")
	public void DeleteDiscountPlan() {
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.NavigateToDiscountPlan();
		loginpage.DeleteDiscountPlan("DiscountPlan1");
	}

}
