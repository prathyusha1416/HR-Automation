package Utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersClass extends BugsScreenshots implements ITestListener {
	public void onTestStart(ITestResult result) {
		System.setProperty("org.uncommons.reportng.title","HR-Automationss Report");
		Reporter.log("Method name is -" + result.getName());
	   System.out.println("Test cases is Starting");
	  }
	public void onTestSuccess(ITestResult result) {
	    Reporter.log("Status of exceusion is -" +result.getStatus());
	  }
	public void onTestFailure(ITestResult result) {
		System.setProperty("org.uncommons.reportng.escape.output","false");
		 System.out.println("Test cases fail screenshot Capture");
		 try {
			 getScreenshot("HR-Automationss");// Which functionality are testing that method name should be replace here then the screenshot name will display as with that name.
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("<a href =\"D:\\Selenium data\\OnboardingProcess-HRA\\test-output\\\">Test result </a>");
	  }
	}


