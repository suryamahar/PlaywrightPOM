package com.qa.thesis.tests;

import org.testng.annotations.Test;

import com.qa.thesis.base.BaseTest;
import com.qa.thesis.factory.PlaywrightFactory;
import com.qa.thesis.pages.LoginPage;

public class DataCreation extends BaseTest {
	@Test
	public void dataCreation() {
		loginpage=new LoginPage(PlaywrightFactory.getPage());	
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		loginpage.NavigateToCourseOffering();
		loginpage.CreateCourseOffering("geg306","2024CY");
		loginpage.CreateCourseOffering("geg328","2024CY");
		loginpage.CreateCourseOffering("geg331","2024CY");
		loginpage.CreateCourseOffering("geg332","2024CY");
		loginpage.CreateCourseOffering("geg341","2024CY");
		loginpage.CreateCourseOffering("geg342","2024CY");
		loginpage.CreateCourseOffering("geg346","2024CY");

	}
}
