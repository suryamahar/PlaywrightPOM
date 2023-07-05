package com.qa.thesis.tests;

import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;

public class HighSchool extends BaseTest{
	
	
	@Test(groups = "regression")
	public void CreateHighSchool() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToHighSchool();
		loginpage.AddHighSchool("moco");
		loginpage.Logout();
	}
	@Test(groups = "regression")
	public void DeleteHighSchool() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.NavigateToHighSchool();
		loginpage.DeleteHighSchool("moco");
		loginpage.Logout();

	} 

}
