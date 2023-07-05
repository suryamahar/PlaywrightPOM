package com.qa.thesis.tests;

import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;

public class HoldType extends BaseTest{
	
	
	@Test(groups = "smoke")
	public void CreateHoldType() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToHoldType();
		loginpage.AddHoldType("toto");
		loginpage.Logout();
	}
	@Test(groups = "smoke")
	public void DeletHoldType() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.NavigateToHoldType();
		loginpage.DeleteHoldType("toto");

	}

}
