package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.0.59:8090/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("kiran.p");
		driver.findElement(By.id("password")).sendKeys("asdASD123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//driver.close();
	}

}
