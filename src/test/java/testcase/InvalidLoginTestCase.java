package testcase;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import page.LogOutpage;
import page.LoginPage;

public class InvalidLoginTestCase extends BaseClass {

	@Test
	public void invalidLoginTest() {

		LoginPage lp = new LoginPage(driver);
		lp.login("Admin", "wrongpassword");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(org.openqa.selenium.By.xpath("//div[@role='alert']//p")));

		LogOutpage lp1 = new LogOutpage(driver);

		String errorText = lp1.getErrorMessage();
		System.out.println("Actual error text is: ---> " + errorText);

		//Assert.assertEquals(errorText , "CSRF token validation failed");
		Assert.assertTrue(errorText.toLowerCase().contains("invalid"));


	}
}