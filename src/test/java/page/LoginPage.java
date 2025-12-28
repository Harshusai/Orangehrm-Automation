package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BaseClass;

public class LoginPage {
	
	
//Constructor:	
	 WebDriver driver;
	public LoginPage (WebDriver driver){
		this.driver=driver;
		}
	
//locators:
	By username = By.name("username");
	By password = By.name("password");
	By button = By.xpath("//button[@type=\"submit\"]");



//LocatorsMethod

public void login(String user , String pwd) {
	driver.findElement(username).sendKeys(user);
	driver.findElement(password).sendKeys(pwd);
	driver.findElement(button).click();
	
}
}