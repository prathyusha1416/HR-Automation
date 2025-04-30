package SuperadminTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.BaseTest;

public class AccesssDelegation extends BaseTest{

	@Test
	public void Loginpage() throws InterruptedException
	  {
		   driver.findElement(By.id("username")).sendKeys("TekskillsIncAdmin.A");
		   driver.findElement(By.id("password")).sendKeys("TekAdmin@#123");
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			this.AccesssDelegation();
			
		}
	@Test
	public void AccesssDelegation() throws InterruptedException {
			try {
				System.out.println("AccessDelegation");
				   Thread.sleep(1000);
				driver.findElement(By.xpath("(//span[normalize-space()='Access Delegation'])[1]")).click();
				
				WebElement username = driver.findElement(By.id("user-name"));
				Select s1 = new Select(username);
				s1.selectByIndex(2);
				Thread.sleep(2000);
				
				WebElement emprole = driver.findElement(By.id("emp-role"));
				Select s2 = new Select(emprole);
				s2.selectByIndex(4);
				Thread.sleep(2000);
				
				WebElement candidatetype = driver.findElement(By.id("candidate-type"));
				Select s3 = new Select(candidatetype);
				s3.selectByIndex(1);
				
				Thread.sleep(2000);
				//Access From
		        WebElement dateInput = driver.findElement(By.id("accessFrom")); 
		        dateInput.sendKeys("23-04-2025");
		        
		      //Access Till
		        WebElement dateInput1 = driver.findElement(By.id("accessTo")); 
		        dateInput1.sendKeys("24-04-2025");
		        
		        driver.findElement(By.xpath("(//b[normalize-space()='SUBMIT'])[1]")).click();
				
}

			catch(Exception e) {
				  System.out.println("Exception");
				  e.printStackTrace();
				  
			  }
			
			
		}
}