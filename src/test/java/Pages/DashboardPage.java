package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
	WebDriver ldriver;
	private By dashboardLocator=By.id("menu_dashboard_index");
	public DashboardPage(WebDriver rdriver)
	{
       ldriver=rdriver;
	}
    public void ClickOnDashboard()
    {
  	   WebElement dashboard = ldriver.findElement(dashboardLocator);
  	   dashboard.click();
    }
}
