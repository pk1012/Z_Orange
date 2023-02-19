package package1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage 
{
	private WebDriver driver;
	private Actions act;
	
	
	public AdminPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
	}
	
	
	@FindBy (xpath = ("(//input [@class = 'oxd-input oxd-input--active']) [2]"))
	private WebElement username;
	
	@FindBy (xpath = ("(//div [@class = 'oxd-select-text-input'] ) [1]"))
	private WebElement userRole;
	
	@FindBy (xpath = ("//input [@placeholder = 'Type for hints...']"))
	private WebElement employeeName;
	
	@FindBy (xpath = ("(//div [@class = 'oxd-select-text oxd-select-text--active']) [2]"))
	private WebElement status;
	
	
	public void enterUsername(String un)
	{
		username.sendKeys(un);
	}
	
	public void selectEssFromUserRole()
	{
		act.click(userRole);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	}
	 
	public void enterEmployeeName(String en)
	{
		employeeName.sendKeys(en);
	}
	
	public void selectDisabledFromStatus()
	{
		act.sendKeys(status, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	}
	
	
	
	
	
	
}
