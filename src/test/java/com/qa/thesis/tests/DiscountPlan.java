package com.qa.thesis.tests;

import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;

public class DiscountPlan extends BaseTest{
	
	
	@Test(groups = "smoke")
	public void CreateDiscountPlan() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToDiscountPlan();
		loginpage.AddDiscountPlan("coco");
		loginpage.Logout();
	}
	@Test(groups = "smoke")
	public void DeleteDiscountPlan() {
		
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.NavigateToDiscountPlan();
		loginpage.DeleteDiscountPlan("coco");
		loginpage.Logout();
	}

}
