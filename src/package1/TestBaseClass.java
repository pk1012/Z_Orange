package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBaseClass 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Velocity\\0 Notes\\2. Automation\\4. Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver(); 
		System.out.println("Opened browser");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.manage().window().maximize();
		System.out.println("Maximised browse");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("Opened URL");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.sendUsername();
		System.out.println("Entered username");
		
		lp.sendPassword();
		System.out.println("Entered password");
		
		lp.clickLoginBtn();
		System.out.println("Clicked on login Btn");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Closed browser");
	}
	
}
