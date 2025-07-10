package SuperadminTestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.BugsScreenshots;

public class Roles extends BaseTest{

	@Test 
	public void Loginpage() throws InterruptedException
	  {
		   driver.findElement(By.id("username")).sendKeys("TekskillsIncAdmin.A");
		   driver.findElement(By.id("password")).sendKeys("TekAdmin@#123");
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			this.AddRoles();
			
		}
	@Test 
	public void AddRoles() throws InterruptedException {
			try {

		//driver.findElement(By.xpath("(//input[@id='RoleName'])[1]")).sendKeys("Accessrole");
				 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='RoleName'])[1]")));
				   element.click();
		//driver.findElement(By.xpath("(//input[@id='RoleName'])[1]")).sendKeys("HR Team");// (Validation message -- Role [Accessroles] is present, please change the name.)It should not allow duplicate name
		//driver.findElement(By.xpath("(//input[@id='RoleName'])[1]")).sendKeys("Access roles");//It should not allow the name betwwen space
		
		//Onboarding
		driver.findElement(By.xpath("(//input[@id='OBTDASHBOARD'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='VERIFYDOCUMENT'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='SALARYNEGOTIATION'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='VERIFYCANDIDATES'])[1]")).click();
		
		//HR
		driver.findElement(By.xpath("(//input[@id='HRDASHBOARD'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='LOI'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='JOINEEFORMS'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='VERIFYJOINEEFORMS'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='APPOIMENTLETTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='STANDARD_HR_LETTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='RELIEVING_LETTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='SIGNATUREMASTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='TEMPLATEMASTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='COMPONENTMASTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='CREATETEMPLATE'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='CLIENTDETAILS'])[1]")).click();
		
		//Audit 
		//driver.findElement(By.xpath("(//input[@id='AUDITDASHBOARD'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='AUDITREVIEW'])[1]")).click();
		
		
		 //Negative Test Cases
		 //If we select the all the fields then data will not be save,because left bar should not support more then 17.
		 
		Assert.assertTrue(false);
		driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
		
		
        String error = driver.findElement(By.xpath("(//div[@id='swal2-html-container'])[1]")).getText();//path for alert message--popup locator

		//driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
		
		/*
		// View Roles - Table - Scrolling 
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,500);");
		
		// View Roles - Table - Edit the Role
		
		//This Scenario for one candidate.
		              
       //Current page to view
        List<WebElement> items = driver.findElements(By.xpath("(//button[normalize-space()='1'])[1]")); 
                for (WebElement item : items) {
                    System.out.println(item.getText());
                }
         Thread.sleep(2000);
         // Next button for page nation
         WebElement nextButton = driver.findElement(By.xpath("(//button[contains(text(),'›')])[1]")); 
         nextButton.click();
         Thread.sleep(2000);
         
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='29']//i[@class='fa fa-eye']")).click();
		driver.findElement(By.xpath("(//input[@id='RoleName'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@id='RoleName'])[1]")).sendKeys("prathyusha");
		
		//Onboarding - Update Test cases
		driver.findElement(By.xpath("(//input[@id='OBTDASHBOARD'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='VERIFYDOCUMENT'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='SALARYNEGOTIATION'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='VERIFYCANDIDATES'])[1]")).click();
		
		//HR - Update Test cases
		driver.findElement(By.xpath("(//input[@id='HRDASHBOARD'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='LOI'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='JOINEEFORMS'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='VERIFYJOINEEFORMS'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='APPOIMENTLETTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='STANDARD_HR_LETTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='RELIEVING_LETTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='SIGNATUREMASTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='TEMPLATEMASTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='COMPONENTMASTER'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='CREATETEMPLATE'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='CLIENTDETAILS'])[1]")).click();
		
		//Audit - Update Test cases
		driver.findElement(By.xpath("(//input[@id='AUDITDASHBOARD'])[1]")).click();
		driver.findElement(By.xpath("(//input[@id='AUDITREVIEW'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[normalize-space()='Update'])[1]")).click();
		//driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
		//driver.findElement(By.xpath("(//button[normalize-space()='Cancel'])[1]")).click();
		
		
		//View Roles - Search
		//driver.findElement(By.xpath("(//input[@id='dt-search-0'])[1]")).sendKeys("Accessroles");
		
		*/
		
		
		/*
		 // Page nation- Test Cases
		 
		while (true) {
            try {
               
            	//Current page to view
                List<WebElement> items = driver.findElements(By.xpath("(//button[normalize-space()='1'])[1]")); 
                for (WebElement item : items) {
                    System.out.println(item.getText());
                }
                Thread.sleep(2000);
                // Next button for page nation
                WebElement nextButton = driver.findElement(By.xpath("(//button[contains(text(),'›')])[1]")); 
                nextButton.click();
                Thread.sleep(2000);

            } 
            	catch (Exception e) {
                System.out.println("No more pages or error occurred: " + e.getMessage());
                break;
            }
        }
		*/
			}
		catch(Exception e) {
			  System.out.println("Exception");
			  e.printStackTrace();
			  
		  }
		
		
	}
}
