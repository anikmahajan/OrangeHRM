package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimePage {
        WebDriver ldriver;
        
        private By timeLocator=By.id("menu_time_viewTimeModule"); 
        private By employeenameLocator=By.id("employee");
        private By viewLocator=By.id("btnView");
        		
        public TimePage(WebDriver rdriver)
        {
        	ldriver=rdriver;
        }
        
        public void ClickOnTime()
        {
        	WebElement time=ldriver.findElement(timeLocator);
        	time.click();
        }
        public void EnterEmployeeName(String value)
        {
        	WebElement employeename=ldriver.findElement(employeenameLocator);
        	employeename.clear();
        	employeename.sendKeys(value);
        }
        public void ClickOnView()
        {
        	WebElement view=ldriver.findElement(viewLocator);
        	view.click();
        }
}
