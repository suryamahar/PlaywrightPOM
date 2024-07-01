package com.qa.thesis.U4SMFramework.Administrative.HomePage;

import com.qa.thesis.U4SMFramework.Navigation.SystemManagementNavigator;
import com.qa.thesis.base.BaseTest;

import com.qa.thesis.factory.PlaywrightFactory;
import com.qa.thesis.pages.LoginPage;

public class HomePage extends BaseTest {
	
     public HomePage()
     {
 		loginpage=new LoginPage(PlaywrightFactory.getPage());	
     }

		public SystemManagementNavigator systemManagementNavigator() {
			return new SystemManagementNavigator();
		}

}