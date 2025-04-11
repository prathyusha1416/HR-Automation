package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
@Test
public class Loginpage {
	private WebDriver driver;
	
	 private String appUrl = "http://192.168.0.59:8090/login";
    @BeforeClass
    public void setup() throws InterruptedException {
    	driver = new ChromeDriver();
        driver.get(appUrl);
        driver.manage().window().maximize();
    }
    
    @Test
    public void Loginpage()
    {
    	driver.findElement(By.id("username")).sendKeys("kiran.p");
		driver.findElement(By.id("password")).sendKeys("asdASD123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    }
    
    @AfterClass
    public void exit() {
    	//driver.close();
    }
}

