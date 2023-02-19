package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeavePage 
{
	private WebDriver driver;
	
	LeavePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = ("(//i [@class = 'oxd-icon bi-calendar oxd-date-input-icon'] ) [1]"))
	private WebElement fromDate;
	
	@FindBy(xpath = ("(//i [@class = 'oxd-icon bi-calendar oxd-date-input-icon'] ) [2]"))
	private WebElement toDate;
	
	public void clickFromDate()
	{
		fromDate.click();
	}

	public void clickToDate()
	{
		toDate.click();
	}
	
	
	
	
	
	
}
