package SuperadminTestCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.BugsScreenshots;

public class Employees extends BaseTest{

	@Test(priority=1) 
	public void Loginpage() throws InterruptedException
	  {
		System.out.println("Login page");
		   driver.findElement(By.id("username")).sendKeys("TekskillsIncAdmin.A");
		  // Assert.assertTrue(false); -- To caputre the screenshot
		   driver.findElement(By.id("password")).sendKeys("TekAdmin@#123");
		   
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			//Assert.assertTrue(false);
			
		
			
		}
	@Test(priority=2) 
	public void Addemployees() throws InterruptedException {
			try {
				System.out.println("Add Employees");
				   Thread.sleep(1000);
				//driver.findElement(By.xpath("//span[text()='Add Employee']")).click();
				   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
				   WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Employee']")));
				   element.click();
				   	
				driver.findElement(By.xpath("(//input[@id='firstName'])[1]")).sendKeys("Mouli");
				driver.findElement(By.xpath("(//input[@id='middleName'])[1]")).sendKeys("Manu");
				driver.findElement(By.xpath("(//input[@id='lastName'])[1]")).sendKeys("Irrinki");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("durgaprasad.gtekskills.in");
				Assert.assertTrue(false);
			//	BugsScreenshots.takeScreenshot(driver, "AlertTest");
			
				//String error = driver.findElement(By.xpath("(//div[contains(text(),'Please enter User Name')])[1]")).getText();

			    
			 //  Assert.assertEquals(error, "This should fail", "Please enter User Name");
				
				WebElement dobInput = driver.findElement(By.xpath("(//input[@id='dob'])[1]")); 
				dobInput.sendKeys("01-04-2025");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@id='contact'])[1]")).sendKeys("8541236970");
				Thread.sleep(2000);
			    WebElement dropdown = driver.findElement(By.id("role"));
				Select s = new Select(dropdown);
				s.selectByIndex(2);
				driver.findElement(By.xpath("(//input[@id='empnumber'])[1]")).sendKeys("8541");
				Assert.assertTrue(false);
				
				driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]")).click();
				//driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
				
				/*
					
				//driver.findElement(By.xpath("(//input[@id='firstName'])[1]")).sendKeys("Mouli5445");
				//driver.findElement(By.xpath("(//input[@id='middleName'])[1]")).sendKeys("Manu567457");
				//driver.findElement(By.xpath("(//input[@id='lastName'])[1]")).sendKeys("567567Irrinki");
				//driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("869898698@gmail");
				//driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("Irrinki9@gmail.com");
				//WebElement dobInput = driver.findElement(By.xpath("(//input[@id='dob'])[1]")); 
				//dobInput.sendKeys("1995-03-15"); --- Date of birth format is not correct
				//WebElement dobInput = driver.findElement(By.xpath("(//input[@id='dob'])[1]")); 
				//dobInput.sendKeys("22-04-2025"); --- should allow the current date
		         
				//driver.findElement(By.xpath("(//input[@id='contact'])[1]")).sendKeys("985412369704");
				//driver.findElement(By.xpath("(//input[@id='empnumber'])[1]")).sendKeys("854125446544");
				*/
				
				// View Employees - Table - Scrolling 
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0,500);");
				
				// View Employees - Table - Edit the Employees
				
				/*
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
		         */
		         
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@value='11']//i[@class='fa fa-eye']")).click();
				driver.findElement(By.xpath("(//input[@id='firstName'])[1]")).clear();
				driver.findElement(By.xpath("(//input[@id='firstName'])[1]")).sendKeys("prathyusha");
				driver.findElement(By.xpath("(//input[@id='middleName'])[1]")).sendKeys("Manu");
				driver.findElement(By.xpath("(//input[@id='lastName'])[1]")).sendKeys("Irrinki");
				Thread.sleep(2000);
				WebElement dobInput1 = driver.findElement(By.xpath("(//input[@id='dob'])[1]")); 
				dobInput1.sendKeys("14-04-2025");
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//input[@id='contact'])[1]")).sendKeys("8545236970");
				Thread.sleep(2000);
			    WebElement dropdown1 = driver.findElement(By.id("role"));
				Select s1 = new Select(dropdown);
				s1.selectByIndex(5);
				
				driver.findElement(By.xpath("(//button[normalize-space()='Update'])[1]")).click();
				//driver.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
				//driver.findElement(By.xpath("(//button[normalize-space()='Cancel'])[1]")).click();
				
				
				
				
			}
			catch(Exception e) {
				  System.out.println("Exception");
				  e.printStackTrace();
				  
			  }
	}
}