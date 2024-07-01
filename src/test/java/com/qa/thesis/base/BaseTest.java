package com.qa.thesis.base;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.microsoft.playwright.Page;
import com.qa.thesis.U4SMFramework.Administrative.HomePage.HomePage;
import com.qa.thesis.factory.PlaywrightFactory;
import com.qa.thesis.pages.LoginPage;

public class BaseTest {
	
	PlaywrightFactory pf;
	Page page;
	public LoginPage loginpage;
	
//	@BeforeTest(groups = {"smoke","regression"})
//	@Parameters({"browser","url"})
//	public  void setup(String browser,String url) {
//		      
//		PlaywrightFactory.initBrowser(browser, url);
//		loginpage=new LoginPage(PlaywrightFactory.getPage());	
//
//	}
//	
//	@AfterMethod(groups = {"smoke","regression"})
//	public void Logout() {
//		
//		loginpage.Logout();
//		
//	}
//	
//	@AfterTest(groups = "smoke")
//	public void teardown() {
//		
//		PlaywrightFactory.getPage().context().browser().close();
//	}

	

	@BeforeMethod()
	public  void setup() {
		      
		PlaywrightFactory.initBrowser("chromium", "https://vmrda02smdbsd10.lab.dev.thesiscloudrd.com/U4SM/");
		loginpage=new LoginPage(PlaywrightFactory.getPage());	

	}
	public HomePage LoginToAdmin() {
		loginpage.LoginToAdmin("cams-mgr","passW0rd!");
		loginpage.clickAgree();
		return new HomePage();
	}
	


}
