package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminFormPage {
WebDriver ldriver;
	
	private By adminLocator=By.id("menu_admin_viewAdminModule");
	private By usermanagementLocator=By.id("menu_admin_UserManagement");
	private By usersLocator=By.id("menu_admin_viewSystemUsers");
	private By usernameLocator=By.id("searchSystemUser_userName");
	private By userroleLocator=By.id("searchSystemUser_userType");
	private By employeenameLocator=By.id("searchSystemUser_employeeName_empName");
	private By statusLocator=By.id("searchSystemUser_status");
	private By searchLocator=By.id("searchBtn");
	
	public AdminFormPage(WebDriver rdriver)
	{
       ldriver=rdriver;
	}
    public void ClickOnAdmin()
    {
  	   WebElement admin = ldriver.findElement(adminLocator);
  	   admin.click();
    }
    public void ClickOnUsermanagement()
    {
  	   WebElement admin = ldriver.findElement(usermanagementLocator);
  	   admin.click();
    }
    public void ClickOnUsers()
    {
  	   WebElement admin = ldriver.findElement(usersLocator);
  	   admin.click();
    }
    public void EnterUsername(String value)
    {
  	   WebElement username = ldriver.findElement(usernameLocator);
  	   username.sendKeys(value);
    }
    public void SelectUserrole(String value)
    {
  	   WebElement userrole = ldriver.findElement(userroleLocator);
  	   Select element = new Select(userrole);
  	   element.selectByVisibleText(value);
    }
    public void EmployeeName(String value)
    {
  	   WebElement username = ldriver.findElement(employeenameLocator);
  	   username.sendKeys(value);
    }
    public void SelectStatus(String value)
    {
  	   WebElement status = ldriver.findElement(statusLocator);
  	   Select element = new Select(status);
  	   element.selectByVisibleText(value);
    }
    public void ClickOnSearch()
    {
  	   WebElement search = ldriver.findElement(searchLocator);
  	   search.click();
    }
}
