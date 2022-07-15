package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DirectoryPage {
	WebDriver ldriver;
	
	private By directoryLocator=By.id("menu_directory_viewDirectory");
	private By nameLocator=By.id("searchDirectory_emp_name_empName");
	private By jobtitleLocator=By.id("searchDirectory_job_title");
	private By locationLocator=By.id("searchDirectory_location");
	private By searchLocator=By.id("searchBtn");
	
	public DirectoryPage(WebDriver rdriver)
	{
       ldriver=rdriver;
	}
    public void ClickOnDirectory()
    {
  	   WebElement directory = ldriver.findElement(directoryLocator);
  	   directory.click();
    }
    public void EnterName(String value)
    {
  	   WebElement name = ldriver.findElement(nameLocator);
  	   name.clear();
  	   name.sendKeys(value);
    }
    public void EnterJobtitle(String value)
    {
  	   WebElement jobtitle = ldriver.findElement(jobtitleLocator);
  	   Select element = new Select(jobtitle);
  	   element.selectByVisibleText(value);
    }
    public void EnterLocation(String value)
    {
  	   WebElement location = ldriver.findElement(locationLocator);
  	   Select element1 = new Select(location);
  	   element1.selectByVisibleText(value);
    }
    public void ClickOnSearch()
    {
  	   WebElement search = ldriver.findElement(searchLocator);
  	   search.click();
    }
}
