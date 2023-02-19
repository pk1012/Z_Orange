package package1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	private WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = ("//span [@class = 'oxd-text oxd-text--span oxd-main-menu-item--name']"))
	private List <WebElement> list;
	
	
	
	
	public void clickOnList(int n)
	{
		list.get(n).click();
	}
	
	
}
