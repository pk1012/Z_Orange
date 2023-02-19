package package1;

import java.io.IOException;
import org.testng.annotations.Test;

public class Test_Verify_System_User_Functionality extends TestBaseClass
{
	@Test
	public void verifySystemUserFunctionality() throws IOException
	{
		HomePage hp = new HomePage(driver); 
		
		hp.clickOnList(0);
		System.out.println("Clicked on Admin");
		
		AdminPage ap = new AdminPage(driver);
		
		ap.enterUsername("Peter123");
		System.out.println("Entered username");
		
		ap.selectEssFromUserRole();
		System.out.println("Selected ESS");
		
		ap.enterEmployeeName("Peter Mac Anderson");
		System.out.println("Entered employee name");
		
		ap.selectDisabledFromStatus();
		System.out.println("Selected Disabled");
		
		UtilityClass.screenshot(driver, "System users fields accept input");

	}
}
