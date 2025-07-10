package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class Loginpage extends BaseTest{
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement loginbutton;
	@FindBy(xpath="//img[@src='/images/homo_logo.png']")
	WebElement Tekskillslogo;
	//intializing the page objects
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	//Actions:
	public String validationLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateTekskillsLogo() {
		return Tekskillslogo.isDisplayed();
	}
	public Dashboard login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		return new Dashboard();
		
	}
	}

