package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AdminFormPage;
import Pages.DashboardPage;
import Pages.DirectoryPage;
import Pages.LeavePage;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.MyInfoPage;
import Pages.PimPage;
import Pages.TimePage;

public class OrangeHRMTestCases extends BaseClass {
	@Test(priority=1)
	public void LoginTest()
	{
		LoginPage lp = new LoginPage(driver);
		lp.EnterUsername("Admin");
		lp.EnterPassword("admin123");
		lp.ClickOnLogin();
	}
	@Test(priority=2)
	public void FillAdminFormTest() throws InterruptedException
	{
		AdminFormPage afp = new AdminFormPage(driver);
		afp.ClickOnAdmin();
		afp.ClickOnUsermanagement();
		afp.ClickOnUsers();
		afp.EnterUsername("Admin");
		afp.SelectUserrole("Admin");
		afp.EmployeeName("Aniket Mahajan");
		afp.SelectStatus("Enabled");
		afp.ClickOnSearch();
	    Thread.sleep(2000);
		WebElement searchtxt=driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr/td[2]/a"));
		String actual_searchtxtname = searchtxt.getText();
		String expected_searchtxtname = "Admin";
		Assert.assertEquals(expected_searchtxtname, actual_searchtxtname);
	}
	@Test(priority=3)
	public void FillPimFormTest() throws InterruptedException
	{
		PimPage pp=new PimPage(driver);
		pp.ClickOnPim();
		pp.ClickOnEmployeelist();
		Thread.sleep(2000);
		pp.EnterEmployeename("Lisa Andrews");
		pp.EnterEmployeeid("0208");
		pp.SelectEmployeestatus("Full-Time Probation");
		pp.SelectInclude("Current and Past Employees");
		pp.EnterSupervisorname("Fiona Grace");
		pp.EnterJobtitle("All");
		pp.EnterSubunit("4");
		pp.ClickOnSearchbtn();
	}
	@Test(priority=4)
	public void FillLeaveFormTest()
	{
		LeavePage lp = new LeavePage(driver);
		lp.ClickOnLeave();
		lp.ClickOnLeavelist();
		lp.EnterLeaveFrom();
		lp.EnterLeaveTo();
		lp.LeaveStatus();
		lp.EnterEmployeename("Aniket");
		lp.EnterSubunit("5");
		lp.SelectPastEmployees();
		lp.ClickonSearch();
	}
	@Test(priority=5)
	public void FillTimeFormTest()
	{
		TimePage tp = new TimePage(driver);
		tp.ClickOnTime();
		tp.EnterEmployeeName("Paul Collings");
		tp.ClickOnView();
	}
	@Test(priority=6)
	public void FillMyInfoFormTest()
	{
		MyInfoPage mip = new MyInfoPage(driver);
		mip.ClickOnMyInfo();
		mip.ClickOnPersonalDetails();
		mip.ClickOnEdit();
		mip.EnterFirstName("Aniket");
		mip.EnterMiddleName("");
		mip.EnterLastName("Mahajan");
		mip.EnterEmployeeId("1234");
		mip.EnterOtherId("5678");
		mip.EnterLicenseNumber("12345678");
		mip.EnterLicenseExpiry();
		mip.EnterSsnNumber("1234");
		mip.EnterSinNumber("5678");
		mip.EnterGender();
		mip.EnterMaritalStatus("Married");
		mip.EnterNationality("Indian");
		mip.EnterDateOfBirth();
		mip.EnterNickName("Archu");
		mip.EnterSmoker();
		mip.EnterMilitaryService("Yes");
		mip.ClickOnSave();
		mip.ClickOnContactDetails();
		mip.ClickOnContactDetailsEdit();
		mip.EnterAddressStreet1("156 H.No Jugial");
		mip.EnterAddressStreet2("157 H.No Jugial");
		mip.EnterCity("Pathankot");
		mip.EnterState("Punjab");
		mip.EnterZipCode("145088");
		mip.EnterCountry("India");
		mip.EnterHomeTelephone("0188691786");
		mip.EnterMobile("9737823782");
		mip.EnterWorkTelephone("0168269286");
		mip.EnterWorkEmail("mahajananiket@gmail.com");
		mip.EnterOtherEmail("aniket1234@gmail.com");
		mip.ClickOnContactDetailsSave();
		mip.ClickOnEmergencyContacts();
		mip.ClickOnAdd();
		mip.EnterEmergencyContactsName("Arjun");
		mip.EnterEmergencyContactsRelationship("Brother");
		mip.EnterEmergencyContactsHomeTelephone("8626752175");
		mip.EnterEmergencyContactsMobile("8197974738");
		mip.EnterEmergencyContactsWorkTelephone("8936748738");
		mip.ClickOnEmergencyContactsSave();
		mip.ClickOnCheckbox();
		mip.ClickOnDelete();
	}
	@Test(priority=7)
	public void DashboardTest()
	{
		DashboardPage dp = new DashboardPage(driver);
		dp.ClickOnDashboard();
	}
	@Test(priority=8)
	public void DirectoryTest() 
	{
		DirectoryPage dip = new DirectoryPage(driver);
		dip.ClickOnDirectory();
		dip.EnterName("Joe Root");
		dip.EnterJobtitle("All");
		dip.EnterLocation("    Canadian Regional HQ");
		dip.ClickOnSearch();
		
	}
	@Test(priority=9)
	public void LogoutTest()
	{
		LogoutPage lp = new LogoutPage(driver);
		lp.ClickOnWelcome();
		lp.ClickOnLogout();
	}
}
