package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PimPage {
    WebDriver ldriver;
	
	private By pimLocator=By.id("menu_pim_viewPimModule");
	private By employeelistLocator=By.id("menu_pim_viewEmployeeList");
	private By employeenameLocator=By.id("empsearch_employee_name_empName");
	private By employeeidLocator=By.id("empsearch_id");
	private By employeestatusLocator=By.id("empsearch_employee_status");
	private By includeLocator=By.id("empsearch_termination");
	private By supervisornameLocator=By.id("empsearch_supervisor_name");
	private By employeejobtitleLocator=By.id("empsearch_job_title");
	private By subunitLocator=By.id("empsearch_sub_unit");
	private By searchbtnLocator=By.id("searchBtn");
	
	public PimPage(WebDriver rdriver)
	{
       ldriver=rdriver;
	}
    public void ClickOnPim()
    {
  	   WebElement pim = ldriver.findElement(pimLocator);
  	   pim.click();
    }
    public void ClickOnEmployeelist()
    {
  	   WebElement employeelist = ldriver.findElement(employeelistLocator);
  	   employeelist.click();
    }
    public void EnterEmployeename(String value)
    {
  	   WebElement employeename = ldriver.findElement(employeenameLocator);
  	   employeename.sendKeys(value);
    }
    public void EnterEmployeeid(String value)
    {
  	   WebElement employeeid = ldriver.findElement(employeeidLocator);
  	   employeeid.sendKeys(value);
    }
    public void SelectEmployeestatus(String value)
    {
  	   WebElement employeestatus = ldriver.findElement(employeestatusLocator);
  	   Select element = new Select(employeestatus);
	   element.selectByVisibleText(value);
    }
    public void SelectInclude(String value)
    {
  	   WebElement include = ldriver.findElement(includeLocator);
  	   Select element = new Select(include);
	   element.selectByVisibleText(value);
    }
    public void EnterSupervisorname(String value)
    {
  	   WebElement supervisorname = ldriver.findElement(supervisornameLocator);
  	   supervisorname.sendKeys(value);
    }
    public void EnterJobtitle(String value)
    {
  	   WebElement jobtitle = ldriver.findElement(employeejobtitleLocator);
  	   Select element = new Select(jobtitle);
	   element.selectByVisibleText(value);
    }
    public void EnterSubunit(String value)
    {
  	   WebElement subunit = ldriver.findElement(subunitLocator);
  	   Select element = new Select(subunit);
	   element.selectByValue(value);
    }
    public void ClickOnSearchbtn()
    {
  	   WebElement searchbtn = ldriver.findElement(searchbtnLocator);
  	   searchbtn.click();
    }
}
