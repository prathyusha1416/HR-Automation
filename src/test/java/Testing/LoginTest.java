package Testing;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Base.BaseTest;
import POM.Dashboard;
import POM.Loginpage;

public class LoginTest extends BaseTest {
    Loginpage loginpage;
    Dashboard dashboard;

    public LoginTest() {
        super();
    }

    @BeforeClass
    public void setup() {
        initialization(); // Open browser once
        loginpage = new Loginpage(driver); // Make sure Loginpage accepts driver
    }

    @Test(priority = 1)
    public void loginpageTitleTest() {
        System.out.println("Running loginpageTitleTest...");
        String title = loginpage.validationLoginPageTitle();
        Assert.assertEquals(title, "OnBoarding Portal");
    }

    @Test(priority = 2)
    public void TekskillsLogoTest() {
        System.out.println("Running TekskillsLogoTest...");
        boolean flag = loginpage.validateTekskillsLogo();
        Assert.assertTrue(false);
    }

    @Test(priority = 3)
    public void logintest() {
        System.out.println("Running logintest...");
        dashboard = loginpage.login(pro.getProperty("username"), pro.getProperty("password"));
    }

    @AfterClass
    public void teardown() {
        System.out.println("Closing browser...");
        //driver.quit();
    }
}


