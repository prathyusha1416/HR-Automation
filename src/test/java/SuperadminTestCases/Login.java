package SuperadminTestCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.BaseTest;
@Test(priority=1)
public class Login extends BaseTest{
	public void Loginpage() throws InterruptedException
	  {
		System.out.println("Login page");
		   driver.findElement(By.id("username")).sendKeys("TekskillsIncAdmin.A");
		   driver.findElement(By.id("password")).sendKeys("TekAdmin@#123");
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
		
			
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
		//	BugsScreenshots.takeScreenshot(driver, "AlertTest");
			Alert alert = driver.switchTo().alert();
	        System.out.println("Alert says: " + alert.getText());

	        // Accept the alert
	        alert.accept();
		}
		catch(Exception e) {
			  System.out.println("Exception");
			  e.printStackTrace();
			  
		  }
}
	}
