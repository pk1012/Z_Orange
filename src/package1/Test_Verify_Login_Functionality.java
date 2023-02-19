package package1;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_Verify_Login_Functionality extends TestBaseClass
{
	@Test
	public void verifyLoginFunctionality() throws IOException, InterruptedException
	{
		Thread.sleep(3000);
		UtilityClass.screenshot(driver, "Logged in");
		
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle))
		{
			System.out.println("your test case is passed");
		}
		else
		{
			System.out.println("your test case is failed");
		}
		
	}
}
