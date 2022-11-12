package com.listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {
	int count=1,maxlimit=3;
	public boolean retry(ITestResult result) {
		if(count<=maxlimit)
		{
			count++;
			return true;
		}
		
		return false;
	}

}
