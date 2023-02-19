package package1;

import org.testng.annotations.Test;

public class Test_Verify_Leave_Functionality extends TestBaseClass
{
	@Test
	public void verifyLeaveFunctionality() throws InterruptedException 
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnList(2);
		System.out.println("Clicked on Leave");
		
		LeavePage lp = new LeavePage(driver);
		
		lp.clickFromDate();
		System.out.println("Clicked on from Date");
		Thread.sleep(3000);
		
		lp.clickToDate();
		System.out.println("Clicked on to Date");
		Thread.sleep(3000);
	}
	
}
