package com.qa.thesis.tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.qa.thesis.base.BaseTest;
import com.qa.thesis.pages.LoginPage;

public class Discount extends BaseTest{

	@Test(groups = "smoke")
	public void CreateDiscount1() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToDiscount();
		loginpage.AddDiscount("loco");
		loginpage.Logout();
	}
	@Test(groups = "smoke")
	public void DeleteDiscount2() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
	//	loginpage.clickAgree();
		loginpage.NavigateToDiscount();
		loginpage.DeleteDiscount("loco");

	}

}
