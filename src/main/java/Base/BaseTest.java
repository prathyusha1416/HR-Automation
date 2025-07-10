package Base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Utilities.TestUtilities;

public class BaseTest {

	
	
public static Properties pro;
public static WebDriver driver;

	public BaseTest()
	{
		try {
			pro= new Properties();
//			FileInputStream ip= new FileInputStream("C:\\Users\\202162\\eclipse-workspace\\OnboardingProcess-HRA\\src\\main\\resources\\Config.properties");
			FileInputStream ip= new FileInputStream("D:\\Selenium data\\OnboardingProcess-HRA\\src\\main\\resources\\Config.properties");
			pro.load(ip);
			System.out.println("Config loaded: " + pro.getProperty("url"));
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization() {
	    String browserName = pro.getProperty("browser");
	    System.out.println("Browser from config: " + browserName);

	    if (browserName == null) {
	        throw new RuntimeException("Browser not specified in config.properties");
	    }

	    if (browserName.equalsIgnoreCase("chrome")) {
	       
	        driver = new ChromeDriver();
	    } else {
	        throw new RuntimeException("Unsupported browser: " + browserName);
	    }

	    driver.manage().window().maximize();
	    driver.get(pro.getProperty("url"));
	

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtilities.PAGE_Load_TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtilities.IMPLICIT_WAIT));

	
	}
}

