package Loginpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginpageMutilpleuserjava {

    public static void main(String[] args) throws InterruptedException {
        // Set path to your ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    	//WebDriver driver = new ChromeDriver();
        // Test data: array of username/password
        String[][] loginData = {
            {"Kiran.p", "asdASD123"},
           {"Devansh.R", "asdASD123"},
            {"Mouli.M", "asdASD123"} // Negative case
        };

        for (String[] credentials : loginData) {
            String username = credentials[0];
            String password = credentials[1];

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://192.168.0.59:8090/login"); // Replace with your URL

            // Fill in login form - use correct locators
            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("username")).sendKeys(username);
            driver.findElement(By.id("password")).clear();
    		driver.findElement(By.id("password")).sendKeys(password);
    		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

            // Wait a bit (you can replace this with WebDriverWait)
            try { Thread.sleep(2000); } catch (InterruptedException e) {}

            // Check result based on page content
            String pageSource = driver.getPageSource();
            if (pageSource.contains("Dashboard")) {
                System.out.println("[PASS] Login successful for: " + username);
            } else if (pageSource.contains("Invalid") || pageSource.contains("error")) {
                System.out.println("[FAIL] Login failed for: " + username);
            } else {
                System.out.println("[CHECK] Unexpected result for: " + username);
            }
            
        }
    }
}


