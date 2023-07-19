package com.qa.thesis.factory;

import java.nio.file.Paths;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.microsoft.playwright.Page;

public class U4smListerners implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		PlaywrightFactory.getPage().screenshot(new Page.ScreenshotOptions()
				.setPath(Paths.get("./screenshots/"+result.getName()+".png")));
	}
	

}
