package Loginpage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.BaseTest;
@Test
public class Login extends BaseTest{
	public void Loginpage() throws InterruptedException
	  {
		System.out.println("Login page");
		   driver.findElement(By.id("username")).sendKeys("TekskillsInc.A");
		   driver.findElement(By.id("password")).sendKeys("TekAdmin@#123");
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
		
			
		}

}
