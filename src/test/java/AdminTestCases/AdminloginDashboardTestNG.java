package AdminTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest;

public class AdminloginDashboardTestNG extends BaseTest{

	/*private WebDriver driver;
	
	 private String appUrl = "http://192.168.0.59:8090/login";
   @BeforeClass
   public void setup() throws InterruptedException {
   	driver = new ChromeDriver();
       driver.get(appUrl);
       driver.manage().window().maximize();
   }
   */
   @Test
   public void Loginpage() throws InterruptedException
   {
   	driver.findElement(By.id("username")).sendKeys("kiran.p");
		driver.findElement(By.id("password")).sendKeys("asdASD1234");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		this.Dashboard();
		}
   
   	//driver.close();
   @Test
   public void Dashboard() throws InterruptedException {
	   try {
		   System.out.println("Dashboard");
			driver.findElement(By.xpath("//h5[text()='Total Candidates ']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h5[text()='Approved Candidates']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h5[text()='Rejected Candidates ']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//h5[text()='Pending Candidates ']")).click();
	   }
	   catch(Exception e) {
			  System.out.println("Exception");
			  e.printStackTrace();
			  
		  }
	   
   }



	}


