package com.qa.thesis.tests;

import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;

public class College extends BaseTest{
	
	
	@Test(groups = "regression")
	public void CreateCollege() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToCollege();
		loginpage.AddCollege("momo");
		loginpage.Logout();
	}
	@Test(groups = "regression")
	public void DeleteCollege() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
	//	loginpage.clickAgree();
		loginpage.NavigateToCollege();
		loginpage.DeleteCollege("momo");
		loginpage.Logout();

	} 

}
