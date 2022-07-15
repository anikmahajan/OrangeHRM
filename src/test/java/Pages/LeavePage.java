package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LeavePage {
WebDriver ldriver;
	
	private By leaveLocator=By.id("menu_leave_viewLeaveModule");
	private By leavelistLocator=By.id("menu_leave_viewLeaveList");
	private By employeenameLocator=By.id("leaveList_txtEmployee_empName");
	private By subunitLocator=By.id("leaveList_cmbSubunit");
	
	public LeavePage(WebDriver rdriver)
	{
       ldriver=rdriver;
	}
    public void ClickOnLeave()
    {
  	   WebElement leave = ldriver.findElement(leaveLocator);
  	   leave.click();
    }
    public void ClickOnLeavelist()
    {
  	   WebElement leavelist = ldriver.findElement(leavelistLocator);
  	   leavelist.click();
    }
    public void EnterLeaveFrom()
    {
       ldriver.findElement(By.id("calFromDate")).click();
       Select element = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
       element.selectByVisibleText("Feb");
       Select element1 = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
       element1.selectByVisibleText("2022");
       ldriver.findElement(By.linkText("11")).click();
       
    }
    public void EnterLeaveTo()
    {
       ldriver.findElement(By.id("calToDate")).click();
       Select element = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
       element.selectByVisibleText("Mar");
       Select element1 = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
       element1.selectByVisibleText("2022");
       ldriver.findElement(By.linkText("12")).click();
       
    }
    public void LeaveStatus()
    {
    	ldriver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click();
    	boolean b = ldriver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).isSelected();
    	System.out.println("Checkbox is Selected : "+b);
    }
    public void EnterEmployeename(String value)
    {
    	WebElement employeename = ldriver.findElement(employeenameLocator);
    	employeename.sendKeys(value);
    }
    public void EnterSubunit(String value)
    {
  	   WebElement subunit = ldriver.findElement(subunitLocator);
  	   Select element = new Select(subunit);
	   element.selectByValue(value);
    }
    public void SelectPastEmployees()
    {
    	ldriver.findElement(By.id("leaveList_cmbWithTerminated")).click();
    }
    public void ClickonSearch()
    {
    	ldriver.findElement(By.id("btnSearch")).click();
    }
}
