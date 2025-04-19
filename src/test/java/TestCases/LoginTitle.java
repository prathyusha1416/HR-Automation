package TestCases;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;

	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.StandardCopyOption;

	public class LoginTitle {
		@Test
	  public void Takescreenshot() {
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Open login page
	            driver.get("http://192.168.0.59:8090/login");

	            // Get actual page title
	            String actualTitle = driver.getTitle();
	            String expectedTitle = "Tekskill";

	            System.out.println("Page title: " + actualTitle);

	            if (!actualTitle.equals(expectedTitle)) {
	                System.out.println("Title is incorrect. Taking screenshot...");

	                // Take screenshot
	                File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	                // Save to specific location
	                File destination = new File("D:/Demo screenshots/Sample.png");
	                Files.copy(screenshot.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);

	                System.out.println("Screenshot saved as Sample.png");
	            } else {
	                System.out.println("Title is correct.");
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit(); // Close browser
	        }
	    }
	}
	

