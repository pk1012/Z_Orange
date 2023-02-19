package package1;

import java.io.IOException;

import org.testng.annotations.Test;

public class Test_Verify_Moving_To_Admin extends TestBaseClass
{
	@Test
	public void verifyMovingToAdmin() throws IOException, InterruptedException
	{
		HomePage hp = new HomePage(driver);
		
		hp.clickOnList(0);
		System.out.println("Clicked on Admin");
		Thread.sleep(3000);
		
		UtilityClass.screenshot(driver, "Moved to Admin");
		
		String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String actualURL = driver.getCurrentUrl();
		
		if (actualURL.equals(expectedURL))
		{
			System.out.println("Your test case for moving to Admin passed");
		}
		else
		{
			System.out.println("Your test case for moving to Admin failed");
		}
		
	}
	
}
