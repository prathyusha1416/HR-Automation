package CandidateTestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.BaseTest;

public class CandidateAddDetails extends BaseTest {

	@Test(priority=0)
	
		public void Loginpage() throws InterruptedException
		  {
			   driver.findElement(By.id("username")).sendKeys("Reyansh.M");
			   driver.findElement(By.id("password")).sendKeys("asdASD1234");
		  	    //driver.findElement(By.id("username")).sendKeys("Mouil.m");
		  	   //driver.findElement(By.id("password")).sendKeys("asdASD12");
				
				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				this.EmploymentDetails();
				this.EducationalDetails();
				this.PersonalDetails();
				
			}
		@Test(priority=1)
		 public void EmploymentDetails() throws InterruptedException {
			try {
				
				driver.findElement(By.xpath("//span[text()='Add Details']")).click();
				driver.findElement(By.xpath("//button[@title=\"Add Employment\"]")).click();
				driver.findElement(By.id("employer_1")).sendKeys("Anusha");
				Thread.sleep(2000);
				//Start Date
				WebElement dateInput = driver.findElement(By.xpath("//input[@placeholder=\"Start Date\"]")); 
		        dateInput.click();
		        
		        // Select the previous year(Switch locator)
		        WebElement previousYear = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]//option[text()='2024']")); // Replace with your target year
		        previousYear.click();

		        WebElement month = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]//option[text()='Mar']")); // Adjust if needed
		        month.click();
		        
		        WebElement day = driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]//a[text()='19']"));
		        Thread.sleep(2000);// Adjust if needed
		        day.click();
		        Thread.sleep(2000);
		        
		      //End Date
				WebElement dateInput1 = driver.findElement(By.xpath("//input[@placeholder=\"End Date\"]")); 
		        dateInput1.click();
		        
		        // Select the previous year(Switch locator)
		        WebElement previousYear1 = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]//option[text()='2024']")); // Replace with your target year
		        previousYear1.click();

		        WebElement month1 = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]//option[text()='Mar']")); // Adjust if needed
		        month1.click();

		        WebElement day1 = driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]//a[text()='20']")); // Adjust if needed
		        day1.click();
		        
		        /*
		        //Negative Cases
		        //End Date
				WebElement dateInput1 = driver.findElement(By.xpath("//input[@placeholder=\"End Date\"]")); 
		        dateInput1.click();
		        
		        // Select the previous year(Switch locator)
		        WebElement previousYear1 = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]//option[text()='2024']")); // Replace with your target year
		        previousYear1.click();

		        WebElement month1 = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]//option[text()='Mar']")); // Adjust if needed
		        month1.click();

		        WebElement day1 = driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]//a[text()='16']")); // Adjust if needed
		        day1.click();
				*/
		   
		        /*
		        Current year date selection 
		         
		         WebElement dateInput = driver.findElement(By.xpath("//input[@placeholder=\"Start Date\"]")); 
		        dateInput.click();
		         
		       // WebElement prevButton = driver.findElement(By.xpath("//span[text()='Prev']"));
		       // prevButton.click();
		        
		        WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		        nextButton.click();
		        
		        // date picker load 
		        try { Thread.sleep(1000); } catch (InterruptedException e) { }

		        //  specific date
		        WebElement date = driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]//a[text()='19']")); 
		        date.click();
				*/
				
				
				/*
				 //Pop up - Are you sure you want to delete the employment
				driver.findElement(By.xpath("//button[@title=\"Remove Employment\"]")).click();
				driver.findElement(By.xpath("//button[text()='Yes']")).click();
				driver.findElement(By.xpath("(//button[text()='No'])[2]")).click();
				Alert alert = driver.switchTo().alert();
				System.out.println("Popup text: " + alert.getText());
				alert.accept();
				alert.dismiss();
				*/
				
				//driver.findElement(By.xpath("(//b[text()='Save'])[1]")).click();
				//driver.findElement(By.xpath("(//b[text()='Reset'])[1]")).click();
				
				driver.findElement(By.xpath("//input[@id='changereason_1']")).sendKeys("Education jhwfehfdwev fhgwejhfge eghfgewhg wgehgewjhg gewgwhe ");
				driver.findElement(By.xpath("//textarea[@id='comments_1']")).sendKeys("ghwfdgghw");
				driver.findElement(By.xpath("(//b[contains(text(),'Save')])[1]")).click();
				//driver.findElement(By.xpath("(//b[contains(text(),'Reset')])[1]")).click();
			}
			catch(Exception e) {
				  System.out.println("Exception");
				  e.printStackTrace();
				  
			  }
		}
		@Test(priority=2)
		public void EducationalDetails() {
			try {
				
				//Course -Postive Test Cases
				driver.findElement(By.xpath("(//input[@id='pg_course'])[1]")).sendKeys("MTech");
				driver.findElement(By.xpath("(//input[@id='grad_course'])[1]")).sendKeys("BTech");
				driver.findElement(By.xpath("(//input[@id='inter_course'])[1]")).sendKeys("Inter");
				driver.findElement(By.xpath("(//input[@id='ssc_course'])[1]")).sendKeys("SSC");
				driver.findElement(By.xpath("(//textarea[@id='comments_course'])[1]")).sendKeys("Ap134");
				Thread.sleep(2000);
				
				//Year of passed out-Postive Test Cases
				driver.findElement(By.xpath("(//input[@id='pg_passout'])[1]")).sendKeys("2025");
				driver.findElement(By.xpath("(//input[@id='grad_passout'])[1]")).sendKeys("2021");
				driver.findElement(By.xpath("(//input[@id='inter_passout'])[1]")).sendKeys("2020");
				driver.findElement(By.xpath("(//input[@id='ssc_passout'])[1]")).sendKeys("1997");
				driver.findElement(By.xpath("(//textarea[@id='comments_passout'])[1]")).sendKeys("2022");
				
				//Percentage-Postive Test Cases
				driver.findElement(By.xpath("(//input[@id='pg_percent'])[1]")).sendKeys("20");
				driver.findElement(By.xpath("(//input[@id='grad_percent'])[1]")).sendKeys("45");
				driver.findElement(By.xpath("(//input[@id='inter_percent'])[1]")).sendKeys("54");
				driver.findElement(By.xpath("(//input[@id='ssc_percent'])[1]")).sendKeys("97");
				driver.findElement(By.xpath("(//textarea[@id='comments_percent'])[1]")).sendKeys("2022");
				
				/*
				//Course -Negative Test Cases
				driver.findElement(By.xpath("(//input[@id='pg_course'])[1]")).sendKeys("1234MTech");
				driver.findElement(By.xpath("(//input[@id='grad_course'])[1]")).sendKeys("454^%BTech");
				driver.findElement(By.xpath("(//input[@id='inter_course'])[1]")).sendKeys("1234Inter");
				driver.findElement(By.xpath("(//input[@id='ssc_course'])[1]")).sendKeys("S567SC");
				driver.findElement(By.xpath("(//input[@id='pg_passout'])[1]")).sendKeys("2021");
				driver.findElement(By.xpath("(//input[@id='pg_passout'])[1]")).sendKeys("Ap");
				

				//Year of passed out- Negative Test Cases
				driver.findElement(By.xpath("(//input[@id='pg_passout'])[1]")).sendKeys("2026");
				driver.findElement(By.xpath("(//input[@id='grad_passout'])[1]")).sendKeys("2026");
				driver.findElement(By.xpath("(//input[@id='inter_passout'])[1]")).sendKeys("2026");
				driver.findElement(By.xpath("(//input[@id='ssc_passout'])[1]")).sendKeys("2026");
				driver.findElement(By.xpath("(//textarea[@id='comments_passout'])[1]")).sendKeys("2026");
				
				//Percentage -  Negative Test Cases
				driver.findElement(By.xpath("(//input[@id='pg_percent'])[1]")).sendKeys("120");
				driver.findElement(By.xpath("(//input[@id='grad_percent'])[1]")).sendKeys("145");
				driver.findElement(By.xpath("(//input[@id='inter_percent'])[1]")).sendKeys("154");
				driver.findElement(By.xpath("(//input[@id='ssc_percent'])[1]")).sendKeys("197");
				driver.findElement(By.xpath("(//textarea[@id='comments_percent'])[1]")).sendKeys("2022");
				*/
				
				driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
				//driver.findElement(By.xpath("(//b[contains(text(),'Reset')])[2]")).click();
				
			}
			catch(Exception e) {
				  System.out.println("Exception");
				  e.printStackTrace();
				  
			  }
		}
		@Test(priority=3)
		public void PersonalDetails() {
			try {
				
				//Postive Test Cases
				driver.findElement(By.xpath("(//input[@id='father'])[1]")).sendKeys("Durga");
				driver.findElement(By.xpath("(//input[@id='mother'])[1]")).sendKeys("Lakshmi");
				driver.findElement(By.xpath("(//input[@id='siblings'])[1]")).sendKeys("1");
				Thread.sleep(2000);
				WebElement dropdown = driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
				Select s = new Select(dropdown);
				s.selectByIndex(2);
				driver.findElement(By.xpath("(//input[@id='spouse'])[1]")).sendKeys("hari");
				driver.findElement(By.xpath("(//input[@id='kids'])[1]")).sendKeys("13");
				driver.findElement(By.xpath("(//input[@id='fil'])[1]")).sendKeys("haritest");
				driver.findElement(By.xpath("(//input[@id='mil'])[1]")).sendKeys("mouni");
				driver.findElement(By.xpath("(//input[@id='nativeloc'])[1]")).sendKeys("HYD");
				driver.findElement(By.xpath("(//input[@id='currloc'])[1]")).sendKeys("BVRM");
				
				
				/*
				//Negative Test Cases
				driver.findElement(By.xpath("(//input[@id='father'])[1]")).sendKeys("35656");
				driver.findElement(By.xpath("(//input[@id='mother'])[1]")).sendKeys("L576fgfghf");
				driver.findElement(By.xpath("(//input[@id='siblings'])[1]")).sendKeys("yyu13");
				Thread.sleep(2000);
				WebElement dropdown1 = driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
				Select s1 = new Select(dropdown1);
				s1.selectByIndex(-1);
				driver.findElement(By.xpath("(//input[@id='spouse'])[1]")).sendKeys("hari242");
				driver.findElement(By.xpath("(//input[@id='kids'])[1]")).sendKeys("13432");
				driver.findElement(By.xpath("(//input[@id='fil'])[1]")).sendKeys("haritest2342");
				driver.findElement(By.xpath("(//input[@id='mil'])[1]")).sendKeys("moun2342i");
				driver.findElement(By.xpath("(//input[@id='nativeloc'])[1]")).sendKeys("HYD234%$^$%");
				driver.findElement(By.xpath("(//input[@id='currloc'])[1]")).sendKeys("BVRM^%^$gh");
				*/
				
				driver.findElement(By.xpath("(//b[text()='Save'])[3]")).click();
				//driver.findElement(By.xpath("(//b[contains(text(),'Reset')])[3]")).click();
				Thread.sleep(2000);
				
				//Form Submit
				driver.findElement(By.xpath("(//b[normalize-space()='Submit'])[1]")).click();
				//driver.findElement(By.xpath("(//a[@id='cancelbtn'])[1]")).click();
				
				Thread.sleep(2000);
			}
			catch(Exception e) {
				  System.out.println("Exception");
				  e.printStackTrace();
				  
			  }
			
		}
}
