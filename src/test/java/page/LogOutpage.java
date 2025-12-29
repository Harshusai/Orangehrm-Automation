package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutpage {
	
	 WebDriver driver;
	
	

	public  LogOutpage(WebDriver driver) {
		this.driver = driver;
		 
	}
	 // ❌ Error message locator
    By errorMsg = By.xpath("//div[@role='alert']//p");



    // get error message text
    public String getErrorMessage() {
        return driver.findElement(errorMsg).getText();
    }
}
