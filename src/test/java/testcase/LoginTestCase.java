package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import page.LoginPage;

public class LoginTestCase extends BaseClass {
	
	@Test
	public void logindetails() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.login("Admin", "admin123");
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
	}
	
	
	
		

}
