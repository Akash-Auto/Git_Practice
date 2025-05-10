package First_Project;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	    @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test Started: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("Test Passed: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("Test Failed: Screenshot Captured  " + result.getName());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("Test Skipped: " + result.getName());
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	        System.out.println("Test Partially Passed: " + result.getName());
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        System.out.println("Test Suite Started: " + context.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("Test Suite Finished: " + context.getName());
	    }

	    @Override
	    public void onTestFailedWithTimeout(ITestResult result) {
	        System.out.println("Test Failed Due to Timeout: " + result.getName());
	    }
	}

