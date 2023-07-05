package com.qa.thesis.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.microsoft.playwright.Page;
import com.qa.thesis.factory.PlaywrightFactory;
import com.qa.thesis.pages.LoginPage;

public class BaseTest {
	
	PlaywrightFactory pf;
	Page page;
	public LoginPage loginpage;
	
	@BeforeTest
	@Parameters({"browser","url"})
	public void setup(String browser,String url) {
		
		pf=new PlaywrightFactory();
		page=pf.initBrowser(browser,url);
		
		loginpage=new LoginPage(page);
	}
	@AfterTest
	public void teardown() {
		
		page.context().browser().close();
	}

}
