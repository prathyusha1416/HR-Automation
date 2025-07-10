package POM;

import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class Dashboard extends BaseTest {

    public Dashboard() {
        PageFactory.initElements(driver, this);
    }

    // Example method
    public String getDashboardTitle() {
        return driver.getTitle();
    }
}