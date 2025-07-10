package CandidateTestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseTest;

public class Resetpassword extends BaseTest{
	@Test
	public void Loginpage() throws InterruptedException
	  {
		   driver.findElement(By.id("username")).sendKeys("Reyansh.M");
		   driver.findElement(By.id("password")).sendKeys("asdASD1234");
	  	    //driver.findElement(By.id("username")).sendKeys("Mouil.m");
	  	   //driver.findElement(By.id("password")).sendKeys("asdASD12");
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
		}
	@Test
	 public void Resetpassword() throws InterruptedException {
		// driver.findElement(By.xpath("//span[text()='Upload Documents']")).click();
		driver.findElement(By.xpath("//input[@name=\"currentpass\"]")).sendKeys("asdASD1234");
		//driver.findElement(By.xpath("//input[@name=\"currentpass\"]")).sendKeys("asdASD123");
		 //driver.findElement(By.xpath("//input[@name=\"currentpass\"]")).sendKeys("asdASD1234");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name=\"newpass\"]")).sendKeys("asdASD12345");
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"confirmnewpass\"]")).sendKeys("asdASD12345");
		Thread.sleep(2000);
		 //driver.findElement(By.xpath("//input[@name=\"confirmnewpass\"]")).sendKeys("asdASD123");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	 }
	 

}
