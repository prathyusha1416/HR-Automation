package Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	
	public static WebDriver driver;
	public static Properties pro = new Properties();
	public static FileReader fr;
	
	
	@BeforeTest 
	public void setup() throws IOException {
		if(driver==null) {
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\ConfigFiles\\Config.properties");
			pro.load(fr);
		}
	if(pro.getProperty("browser").equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		driver.get(pro.getProperty("testurl"));
	}
	else if(pro.getProperty("browser").equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
		driver.get(pro.getProperty("testurl"));
	}
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
    
	}
	 @AfterTest
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	        System.out.println("Teardown Successfully");
	    }    
	}



