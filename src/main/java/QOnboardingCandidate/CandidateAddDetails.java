package QOnboardingCandidate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CandidateAddDetails {
	public WebDriver driver;
@FindBy(xpath="//span[text()='Add Details']")
WebElement Adddetails;
@FindBy(xpath="//button[@title=\"Add Employment\"]']")
WebElement AddEmployment;
@FindBy(id="employer_1")
WebElement Employer;
@FindBy(xpath = "//input[@placeholder=\"Start Date\"]")
WebElement StartDate;
@FindBy(xpath = "//select[@class=\"ui-datepicker-year\"]//option[text()='2024']")
WebElement PreviousDate;
@FindBy(xpath = "//select[@class=\"ui-datepicker-month\"]//option[text()='Mar']")
WebElement NextDate;
@FindBy(xpath = "//td[@data-handler=\"selectDay\"]//a[text()='19']")
WebElement Selectday;
@FindBy(xpath = "//input[@placeholder=\"End Date\"]")
WebElement Enddate;
@FindBy(xpath = "//select[@class=\"ui-datepicker-year\"]//option[text()='2024']")
WebElement previousYear1;
@FindBy(xpath = "//select[@class=\"ui-datepicker-month\"]//option[text()='Mar']")
WebElement month1;
@FindBy(xpath = "//td[@data-handler=\"selectDay\"]//a[text()='20']")
WebElement day1;

@FindBy(xpath = "//input[@id='changereason_1']")
WebElement ChangeReason;
@FindBy(xpath = "//textarea[@id='comments_1']")
WebElement Comments;
@FindBy(xpath = "//b[contains(text(),'Save')])[1]")
WebElement Save;


//intializing the page objects
	public CandidateAddDetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void Adddetails() {
		Adddetails.click();	
		AddEmployment.click();
		Employer.sendKeys("Tech Corp Pvt Ltd");

		StartDate.click();
		PreviousDate.click();
		NextDate.click();
		Selectday.click();

		Enddate.click();
		previousYear1.click();
		month1.click();
		day1.click();

		ChangeReason.sendKeys("Career Advancement");
		Comments.sendKeys("Moved to a better opportunity with higher responsibilities.");

		Save.click();

       
	}
	

	
}

  
