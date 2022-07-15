package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
     WebDriver ldriver;
     
     private By welcomeLocator=By.id("welcome");
     private By logoutLocator=By.linkText("Logout");
     
     public LogoutPage(WebDriver driver)
     {
    	 ldriver=driver;
     }
     public void ClickOnWelcome()
     {
    	 WebElement welcome=ldriver.findElement(welcomeLocator);
    	 welcome.click();
     }
     public void ClickOnLogout()
     {
    	 WebElement logout=ldriver.findElement(logoutLocator);
    	 logout.click();
     }
}
