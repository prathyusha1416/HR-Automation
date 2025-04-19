package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BaseTest;

public class LoginpageCandidateEditprofileTestNG extends BaseTest {

	/*private WebDriver driver;
	
	 private String appUrl = "http://192.168.0.59:8090/login";
  @BeforeClass
  public void setup() throws InterruptedException {
  	driver = new ChromeDriver();
      driver.get(appUrl);
      driver.manage().window().maximize();
  }*/
  
  @Test
  public void Loginpage() throws InterruptedException
  {
	   driver.findElement(By.id("username")).sendKeys("Mouli.m");
  	    //driver.findElement(By.id("username")).sendKeys("Mouil.m");
		driver.findElement(By.id("password")).sendKeys("asdASD123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		this.Editprofile();
		}
  
  	//driver.close();
  @Test
  public void Editprofile() throws InterruptedException {
	  try {
		  System.out.println("Edit profile");
		   Thread.sleep(1000);
	       driver.findElement(By.xpath("//button[text()='Edit Profile']")).click();
	       
	       driver.findElement(By.xpath("//input[@name='fullname']")).clear();
	       driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Mouli Manu");
	       //driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("3244546546465465");
	       //driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Mouli 64668357979857 Manu");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name='jobtitle']")).click();
	       driver.findElement(By.xpath("//input[@name='jobtitle']")).clear();
	       driver.findElement(By.xpath("//input[@name='jobtitle']")).sendKeys("test QA Engineer");
	       //driver.findElement(By.xpath("//input[@name='jobtitle']")).sendKeys("test QA 565465654");
	       //driver.findElement(By.xpath("//input[@name='jobtitle']")).sendKeys("test QA 465654^&^&**&^");
	       
	       //File upload
	       
	       driver.findElement(By.xpath("//input[@type=\"file\"]")).clear();
	       driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads\\0f03366d-b599-40a9-9222-463796b986e6 (1).jpg");
	       //driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("D:\\Prathyusha Data Dont Dlt\\Downloads");
	       Thread.sleep(3000);
	       
	       //Present Address
	       
	       driver.findElement(By.xpath("//input[@name='presentLine']")).clear();
	       driver.findElement(By.xpath("//input[@name='presentLine']")).sendKeys("1234 Maple Street Apartment 56B");
	       //driver.findElement(By.xpath("//input[@name='presentLine']")).sendKeys("1234 Maple Street Apartment 56jgfghfggfjgdfhgB");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name='presentCity']")).clear();
	       driver.findElement(By.xpath("//input[@name='presentCity']")).sendKeys("Bhimavaram");
	       //driver.findElement(By.xpath("//input[@name='presentCity']")).sendKeys("Bhimavaram123");
	       //driver.findElement(By.xpath("//input[@name='presentCity']")).sendKeys("");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name='presentState']")).clear();
	       driver.findElement(By.xpath("//input[@name='presentState']")).sendKeys("Veeravasaram");
	       //driver.findElement(By.xpath("//input[@name='presentState']")).sendKeys("Veeravasaram^%76578");
	       //driver.findElement(By.xpath("//input[@name='presentState']")).sendKeys("");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name=\"presentPin\"]")).clear();
	       driver.findElement(By.xpath("//input[@name=\"presentPin\"]")).sendKeys("13221");
	       //driver.findElement(By.xpath("//input[@name=\"presentPin\"]")).sendKeys("13221-13232");
	       //driver.findElement(By.xpath("//input[@name='presentPin']")).sendKeys("");
	       Thread.sleep(2000);
	       
	       //Permanent address
	       
	       driver.findElement(By.xpath("//input[@name=\"premenantLine\"]")).clear();
	       driver.findElement(By.xpath("//input[@name=\"premenantLine\"]")).sendKeys("bvddfbn bfkgskdgfk bjfbj3766gef gfihg377");
	       //driver.findElement(By.xpath("//input[@name=\"premenantLine\"]")).sendKeys("bvddfbn bfkgskdgfk bjfbj3766gef gfihg3777 kiran");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name=\"premenantCity\"]")).clear();
	       driver.findElement(By.xpath("//input[@name=\"premenantCity\"]")).sendKeys("Bhimavaram");
	       //driver.findElement(By.xpath("//input[@name='presentCity']")).sendKeys("Bhimavaram123");
	       //driver.findElement(By.xpath("//input[@name='presentCity']")).sendKeys("");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name=\"premenantState\"]")).clear();
	       driver.findElement(By.xpath("//input[@name=\"premenantState\"]")).sendKeys("Veeravasaram");
	       //driver.findElement(By.xpath("//input[@name='presentState']")).sendKeys("Veeravasaram^%76578");
	       //driver.findElement(By.xpath("//input[@name='presentState']")).sendKeys("");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name=\"premenantPin\"]")).clear();
	       driver.findElement(By.xpath("//input[@name=\"premenantPin\"]")).sendKeys("13221");
	       //driver.findElement(By.xpath("//input[@name=\"presentPin\"]")).sendKeys("13221-13232");
	       //driver.findElement(By.xpath("//input[@name='presentPin']")).sendKeys("");
	       Thread.sleep(2000);
	       
	       //Mobile Number
	       
	       driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).clear();
	       driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).sendKeys("9632587410");
	       //driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).sendKeys("gjjggfjkgkgdfg");
	        //driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).sendKeys("963258741023");
	       //driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).sendKeys("1236547");
	       //driver.findElement(By.xpath("//input[@placeholder=\"Enter Mobile Number\"]")).sendKeys("");
	       Thread.sleep(3000);
	       
	       //Email Id
	       
	       driver.findElement(By.xpath("//input[@placeholder=\"Enter Email \"]")).clear();
	       driver.findElement(By.xpath("//input[@placeholder=\"Enter Email \"]")).sendKeys("Kiran@gmail.com");
	       //driver.findElement(By.xpath("//input[@placeholder=\"Enter Email \"]")).clear();
	       //driver.findElement(By.xpath("//input[@placeholder=\"Enter Email \"]")).sendKeys("Kirangmailcom");
	       //Thread.sleep(2000);
	       //driver.findElement(By.xpath("//input[@placeholder=\"Enter Email \"]")).clear();
	       //driver.findElement(By.xpath("//input[@placeholder=\"Enter Email \"]")).sendKeys("786326784786%$$&^$&^^&%^&*&*&*");
	       
	       //URL
	       
	       driver.findElement(By.xpath("//input[@title=\"https://www.linkedin.com/in/your-profile-title/\"]")).clear();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@title=\"https://www.linkedin.com/in/your-profile-title/\"]")).sendKeys("https://www.linkedin.com/");
	       //driver.findElement(By.xpath("//input[@title=\"https://www.linkedin.com/in/your-profile-title/\"]")).clear();
	       //Thread.sleep(2000);
	       //driver.findElement(By.xpath("//input[@title=\"https://www.linkedin.com/in/your-profile-title/\"]")).sendKeys("htt//www.linkedin.com/");
	       //driver.findElement(By.xpath("//input[@title=\"https://www.linkedin.com/in/your-profile-title/\"]")).clear();
	       //Thread.sleep(2000);
	       //driver.findElement(By.xpath("//input[@title=\"https://www.linkedin.com/in/your-profile-title/\"]")).sendKeys("https://www.linkedinom/");
	       Thread.sleep(2000);
	       
	       driver.findElement(By.xpath("//button[text()='Save Changes']")).click();
	       Thread.sleep(2000);
	      
	       //driver.quit();
	  }
	  catch(Exception e) {
		  System.out.println("Exception");
		  e.printStackTrace();
		  
	  }
	   
  }
  
}
