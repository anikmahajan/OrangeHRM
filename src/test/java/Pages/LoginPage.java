package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver ldriver;
	
	private By usernameLocator=By.id("txtUsername");
	private By passwordLocator=By.id("txtPassword");
	private By loginLocator=By.id("btnLogin");
	
	public LoginPage(WebDriver rdriver)
	{
       ldriver=rdriver;
	}
    public void EnterUsername(String value)
    {
  	   WebElement username = ldriver.findElement(usernameLocator);
  	   username.sendKeys(value);
    }
    public void EnterPassword(String value)
    {
    	WebElement password = ldriver.findElement(passwordLocator);
	  	password.sendKeys(value);
    }
    public void ClickOnLogin()
    {
    	WebElement login = ldriver.findElement(loginLocator);
	  	login.click();
    }
}
