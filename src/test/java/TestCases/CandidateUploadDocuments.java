package TestCases;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.Test;

import Base.BaseTest;
import Utilities.BugsScreenshots;

public class CandidateUploadDocuments extends BaseTest{
	
	public static String java;
	public BugsScreenshots bugsScreenshots;
	@Test
	public void Loginpage() throws InterruptedException
	  {
		   driver.findElement(By.id("username")).sendKeys("Reyansh.M");
		   driver.findElement(By.id("password")).sendKeys("asdASD1234");
	  	    //driver.findElement(By.id("username")).sendKeys("Mouil.m");
	  	   //driver.findElement(By.id("password")).sendKeys("asdASD12");
			
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			this.Uploaddocuments();
			
		}
	@Test
	 public void Uploaddocuments() throws InterruptedException {
		try {
			driver.findElement(By.xpath("//span[text()='Upload Documents']")).click();//Upload document 
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,1000);");
			//driver.findElement(By.xpath("(//i[@onclick=\"removefile(this)\"])[1]")).click();//remove
			driver.findElement(By.xpath("//input[@name=\"sscdocs\"]")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\0f03366d-b599-40a9-9222-463796b986e6 (1).jpg");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("(//i[@onclick=\"removefile(this)\"])[2]")).click();
			driver.findElement(By.xpath("//input[@name=\"hscdocs\"]")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\0f03366d-b599-40a9-9222-463796b986e6 (2) (1) (1) (1) (1).jpg");
			Thread.sleep(1000);
			//Duplicate file method
			//driver.findElement(By.xpath("(//i[@onclick=\"removefile(this)\"])[3]")).click();
			//driver.findElement(By.xpath("//input[@name=\"diplomadocs\"]")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\0f03366d-b599-40a9-9222-463796b986e6 (2) (1) (1) (1) (1).jpg");
			//Thread.sleep(1000);
			//driver.findElement(By.xpath("(//i[@onclick=\"removefile(this)\"])[4]")).click();
			//driver.findElement(By.xpath("//input[@name=\"postgraddocs\"]")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\0f03366d-b599-40a9-9222-463796b986e6 (2) (1) (1) (1) (1).jpg");
			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//i[@onclick=\"removefile(this)\"])[3]")).click();
			driver.findElement(By.xpath("//input[@name=\"diplomadocs\"]")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\0f03366d-b599-40a9-9222-463796b986e6 (2) (2) (1).jpg");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("(//i[@onclick=\"removefile(this)\"])[4]")).click();
			driver.findElement(By.xpath("//input[@name=\"graddocs\"]")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\0f03366d-b599-40a9-9222-463796b986e6 (2).jpg");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("(//i[@onclick=\"removefile(this)\"])[5]")).click();
			driver.findElement(By.xpath("//input[@name=\"postgraddocs\"]")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\1_2023.09.12.16.09.04.718.PNG");
			Thread.sleep(1000);
			//driver.findElement(By.xpath("(//i[@onclick=\"removefile(this)\"])[6]")).click();
			driver.findElement(By.id("educationOtherdocs")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\1099 status report (6).PNG");
			//driver.findElement(By.xpath("//button[@onclick=\"candsave(1)\"]")).click();//Save
			//driver.findElement(By.xpath("(//button[text()='Reset'])[1]")).click();//Reset
			//driver.findElement(By.xpath("(//a[@class=\"btn btn-danger\"])[1]")).click();//Cancel
			Thread.sleep(2000);
			
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollTo(0,1000);");
			driver.findElement(By.xpath("(//a[@class=\"btn btn-secondary\"])[1]")).click();//Next
			//Thread.sleep(2000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollTo(0,1000);");
			driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();//dropdown action
			driver.findElement(By.id("emp1_offerletter")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\16-06-2021 (1).PNG");
			driver.findElement(By.xpath("(//button[@type=\"button\"])[5]")).click();
			driver.findElement(By.id("emp2_offerletter")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\aadhan_2023.09.12.16.10.49.751.PNG");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@onclick=\"btn3click()\"]")).click();//Next
			//driver.findElement(By.xpath("//button[@onclick=\"candsave(2)\"]")).click();//Save
			//driver.findElement(By.xpath("(//button[text()='Reset'])[2]")).click();//Reset
			//driver.findElement(By.xpath("(//a[@class=\"btn btn-danger\"])[2]")).click();//Cancel
			
			/*
			//driver.findElement(By.xpath("//a[@onclick=\"btn2click()\"]")).click();//previous button
			
			//Employeement documents action buttons(+,-)
			driver.findElement(By.xpath("//i[@class=\"fa fa-plus\"]")).click();
			driver.findElement(By.xpath("//i[@class=\"fa fa-plus\"]")).click();
			driver.findElement(By.xpath("//i[@class=\"fa fa-plus\"]")).click();
			driver.findElement(By.xpath("//i[@class=\"fa fa-minus\"]")).click();
			Thread.sleep(1000);
			
			//driver.findElement(By.xpath("//button[text()='Yes']")).click();
			driver.findElement(By.xpath("//button[text()='Cancel']")).click();
			Alert alert = driver.switchTo().alert();
			System.out.println("Popup text: " + alert.getText());
			//alert.accept();
			alert.dismiss();
		*/
			
			
			Thread.sleep(1000);
			driver.findElement(By.id("aadhar")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\Aadhar Card (1).pdf");
			Thread.sleep(1000);
			driver.findElement(By.id("pancard")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\Aadhar Card (2).pdf");
			driver.findElement(By.xpath("//button[text()='Submit for Verification']")).click();
			//driver.findElement(By.xpath("(//button[text()='Reset'])[3]")).click();//Reset
			//driver.findElement(By.xpath("(//a[@class=\"btn btn-danger\"])[3]")).click();//Cancel
			/*
			 //driver.findElement(By.xpath("//a[@onclick=\"btn4click()\"]")).click();//previous button
			
			//Mandatory alert popup
			driver.findElement(By.xpath("//button[text()='Submit for Verification']")).click();
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			Alert alert = driver.switchTo().alert();
			System.out.println("Popup text: " + alert.getText());
			alert.accept();   
			*/
					
		}	
		catch(Exception e) {
			  System.out.println("Exception");
			  e.printStackTrace();
			  
		  }
		
		  
	}
	}
	
	
	 

