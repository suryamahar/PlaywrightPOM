package com.qa.thesis.base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	private int maxRetryCount=1;
	private int currentRetryCount=0;
	
	@Override
	public boolean retry (ITestResult result) {
		if (currentRetryCount<maxRetryCount) {
			currentRetryCount++;
			return true;
		}
		return false;
	}


}
