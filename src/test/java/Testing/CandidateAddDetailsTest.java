package Testing;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Base.BaseTest;
import POM.Dashboard;
import QOnboardingCandidate.CandidateAddDetails;

public class CandidateAddDetailsTest extends BaseTest{
	CandidateAddDetails AddDetails;
	Dashboard dashboard;
	
	 public CandidateAddDetailsTest() {
	        super();
	    }
	/* @BeforeClass
	    public void setup() {
	        initialization(); // Open browser once
	        AddDetails = new CandidateAddDetails(driver); // Make sure Loginpage accepts driver
	    }*/
	 
	 @Test(priority = 1)
	    public void fillEmploymentDetailsTest() {
	        System.out.println("Running Add Details Test...");

	        String actualTitle = driver.getTitle();  // or check a confirmation element
	        Assert.assertEquals(actualTitle, "Expected Title After Save", "Add Details action failed or did not navigate correctly.");
	 }
	    @AfterClass
	    public void tearDown() {
	        System.out.println("Closing browser...");
	        //driver.quit();
	        
	    }
}

