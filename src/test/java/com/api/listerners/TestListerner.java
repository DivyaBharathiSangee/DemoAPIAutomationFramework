package com.api.listerners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListerner implements ITestListener{

	public class TestListener implements ITestListener {
	    private  final Logger logger = LogManager.getLogger(TestListener.class);

	   
	    public void onStart(ITestContext context) {
	       // logger.info("Test Started: {}", result.getName());
	    	logger.info("test suite started");
	    }
	    public void onFinish(ITestContext context) {
		       // logger.info("Test Started: {}", result.getName());
		    	logger.info("test suite completed");
		    }

	    public void onTestStarted(ITestResult result) {
		       // logger.info("Test Passed: {}", result.getName());
		    	logger.info("started!!"+result.getMethod().getMethodName());
		    	//logger.info("Description!!"+result.getMethod().getDescription());
		    	
		    }
	    @Override
	    public void onTestSuccess(ITestResult result) {
	       // logger.info("Test Passed: {}", result.getName());
	    	logger.info("passed!!"+result.getMethod().getMethodName());
	    	logger.info("Description!!"+result.getMethod().getDescription());
	    	
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        //logger.error("Test Failed: {}", result.getName());
	       // logger.error("Exception: ", result.getThrowable());
	    	logger.error("Failed"+result.getMethod().getMethodName());
	    }
	}

}
