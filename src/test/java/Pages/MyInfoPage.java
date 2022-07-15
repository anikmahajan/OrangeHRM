package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyInfoPage {
    WebDriver ldriver;
	
	private By myinfoLocator=By.id("menu_pim_viewMyDetails");
	private By personaldetailsLocator=By.linkText("Personal Details");
	private By editLocator=By.id("btnSave");
	private By firstnameLocator=By.id("personal_txtEmpFirstName");
	private By middlenameLocator=By.id("personal_txtEmpMiddleName");
	private By lastnameLocator=By.id("personal_txtEmpLastName");
	private By empidLocator=By.id("personal_txtEmployeeId");
	private By otheridLocator=By.id("personal_txtOtherID");
	private By licensenumberLocator=By.id("personal_txtLicenNo");
	private By ssnnumberLocator=By.id("personal_txtNICNo");
	private By sinnumberLocator=By.id("personal_txtSINNo");
	private By maritalstatusLocator=By.id("personal_cmbMarital");
	private By nationalityLocator=By.id("personal_cmbNation");
	private By nicknameLocator=By.id("personal_txtEmpNickName");
	private By militaryserviceLocator=By.id("personal_txtMilitarySer");
	private By saveLocator=By.id("btnSave"); 
	private By contactdetailsLocator=By.linkText("Contact Details");
	private By contactdetailseditLocator=By.id("btnSave");
	private By addressstreet1Locator=By.id("contact_street1");
	private By addressstreet2Locator=By.id("contact_street2");
	private By cityLocator=By.id("contact_city");
	private By stateLocator=By.id("contact_province");
	private By zipcodeLocator=By.id("contact_emp_zipcode");
	private By countryLocator=By.id("contact_country");
	private By hometelephoneLocator=By.id("contact_emp_hm_telephone");
	private By mobileLocator=By.id("contact_emp_mobile");
	private By worktelephoneLocator=By.id("contact_emp_work_telephone");
	private By workemailLocator=By.id("contact_emp_work_email");
	private By otheremailLocator=By.id("contact_emp_oth_email");
	private By contactdetailssaveLocator=By.id("btnSave");
	private By emergencycontactsLocator=By.linkText("Emergency Contacts");
	private By addLocator=By.id("btnAddContact");
	private By emercontactsnameLocator=By.id("emgcontacts_name");
	private By emercontactsrelationshipLocator=By.id("emgcontacts_relationship");
	private By emercontactshometelephoneLocator=By.id("emgcontacts_homePhone");
	private By emercontactsmobileLocator=By.id("emgcontacts_mobilePhone");
	private By emercontactsworktelephoneLocator=By.id("emgcontacts_workPhone");
	private By emercontactssaveLocator=By.id("btnSaveEContact");
	private By emercontactscheckboxLocator=By.className("checkbox");
	private By emercontactsdeleteLocator=By.id("delContactsBtn");
	
	public MyInfoPage(WebDriver rdriver)
	{
       ldriver=rdriver;
	}
    public void ClickOnMyInfo()
    {
  	   WebElement myinfo = ldriver.findElement(myinfoLocator);
  	   myinfo.click();
    }
    public void ClickOnPersonalDetails()
    {
  	   WebElement personaldetails = ldriver.findElement(personaldetailsLocator);
  	   personaldetails.click();
    }
    public void ClickOnEdit()
    {
  	   WebElement edit = ldriver.findElement(editLocator);
  	   edit.click();
    }
    public void EnterFirstName(String value)
    {
    	WebElement firstname = ldriver.findElement(firstnameLocator);
    	firstname.clear();
    	firstname.sendKeys(value);
    }
    public void EnterMiddleName(String value)
    {
    	WebElement middlename = ldriver.findElement(middlenameLocator);
    	middlename.clear();
    	middlename.sendKeys(value);
    }
    public void EnterLastName(String value)
    {
    	WebElement lastname = ldriver.findElement(lastnameLocator);
    	lastname.clear();
    	lastname.sendKeys(value);
    }
    public void EnterEmployeeId(String value)
    {
    	WebElement empid = ldriver.findElement(empidLocator);
    	empid.clear();
    	empid.sendKeys(value);
    }
    public void EnterOtherId(String value)
    {
    	WebElement otherid = ldriver.findElement(otheridLocator);
    	otherid.clear();
    	otherid.sendKeys(value);
    }
    public void EnterLicenseNumber(String value)
    {
    	WebElement licensenumber = ldriver.findElement(licensenumberLocator);
    	licensenumber.clear();
    	licensenumber.sendKeys(value);
    }
    public void EnterLicenseExpiry()
    {
       ldriver.findElement(By.id("personal_txtLicExpDate")).click();
       Select element = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
       element.selectByVisibleText("Feb");
       Select element1 = new Select(ldriver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
       element1.selectByVisibleText("2040");
       ldriver.findElement(By.linkText("2")).click();
       
    }
    public void EnterSsnNumber(String value)
    {
    	WebElement ssnnumber = ldriver.findElement(ssnnumberLocator);
    	ssnnumber.clear();
    	ssnnumber.sendKeys(value);
    }
    public void EnterSinNumber(String value)
    {
    	WebElement sinnumber = ldriver.findElement(sinnumberLocator);
    	sinnumber.clear();
    	sinnumber.sendKeys(value);
    }
    public void EnterGender()
    {
     	ldriver.findElement(By.id("personal_optGender_1")).click();
    	boolean b = ldriver.findElement(By.id("personal_optGender_1")).isSelected();
    	System.out.println("Checkbox is Selected : "+b);
    }
    public void EnterMaritalStatus(String value)
    {
	   WebElement maritalstatus = ldriver.findElement(maritalstatusLocator);
	   Select element = new Select(maritalstatus);
	   element.selectByVisibleText(value);
    }
    public void EnterNationality(String value)
    {
	   WebElement nationality = ldriver.findElement(nationalityLocator);
	   Select element = new Select(nationality);
	   element.selectByVisibleText(value);
    }
    public void EnterDateOfBirth()
    {
       ldriver.findElement(By.id("personal_DOB")).click();
       Select element = new Select(ldriver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
       element.selectByVisibleText("Nov");
       Select element1 = new Select(ldriver.findElement(By.xpath("//select[@data-handler='selectYear']")));
       element1.selectByVisibleText("1999");
       ldriver.findElement(By.linkText("5")).click();
    }
    public void EnterNickName(String value)
    {
    	WebElement nickname = ldriver.findElement(nicknameLocator);
    	nickname.clear();
    	nickname.sendKeys(value);
    }
    public void EnterSmoker()
    {
     	ldriver.findElement(By.id("personal_chkSmokeFlag")).click();
    }
    public void EnterMilitaryService(String value)
    {
    	WebElement militaryservice = ldriver.findElement(militaryserviceLocator);
    	militaryservice.clear();
    	militaryservice.sendKeys(value);
    }
    public void ClickOnSave()
    {
    	WebElement save = ldriver.findElement(saveLocator);
    	save.click();
    }
    public void ClickOnContactDetails()
    {
  	   WebElement contactdetails = ldriver.findElement(contactdetailsLocator);
  	   contactdetails.click();
    }
    public void ClickOnContactDetailsEdit()
    {
  	   WebElement contactdetailsedit = ldriver.findElement(contactdetailseditLocator);
  	   contactdetailsedit.click();
    }
    public void EnterAddressStreet1(String value)
    {
    	WebElement addressstreet1 = ldriver.findElement(addressstreet1Locator);
    	addressstreet1.clear();
    	addressstreet1.sendKeys(value);
    }
    public void EnterAddressStreet2(String value)
    {
    	WebElement addressstreet2 = ldriver.findElement(addressstreet2Locator);
    	addressstreet2.clear();
    	addressstreet2.sendKeys(value);
    }
    public void EnterCity(String value)
    {
    	WebElement city = ldriver.findElement(cityLocator);
    	city.clear();
    	city.sendKeys(value);
    }
    public void EnterState(String value)
    {
    	WebElement state = ldriver.findElement(stateLocator);
    	state.clear();
    	state.sendKeys(value);
    }
    public void EnterZipCode(String value)
    {
    	WebElement zipcode = ldriver.findElement(zipcodeLocator);
    	zipcode.clear();
    	zipcode.sendKeys(value);
    }
    public void EnterCountry(String value)
    {
    	WebElement country = ldriver.findElement(countryLocator);
    	Select element = new Select(country);
 	    element.selectByVisibleText(value);
    }
    public void EnterHomeTelephone(String value)
    {
    	WebElement hometelephone = ldriver.findElement(hometelephoneLocator);
    	hometelephone.clear();
    	hometelephone.sendKeys(value);
    }
    public void EnterMobile(String value)
    {
    	WebElement mobile = ldriver.findElement(mobileLocator);
    	mobile.clear();
    	mobile.sendKeys(value);
    }
    public void EnterWorkTelephone(String value)
    {
    	WebElement worktelephone = ldriver.findElement(worktelephoneLocator);
    	worktelephone.clear();
    	worktelephone.sendKeys(value);
    }
    public void EnterWorkEmail(String value)
    {
    	WebElement workemail = ldriver.findElement(workemailLocator);
    	workemail.clear();
    	workemail.sendKeys(value);
    }
    public void EnterOtherEmail(String value)
    {
    	WebElement otheremail = ldriver.findElement(otheremailLocator);
    	otheremail.clear();
    	otheremail.sendKeys(value);
    }
    public void ClickOnContactDetailsSave()
    {
  	   WebElement contactdetailssave = ldriver.findElement(contactdetailssaveLocator);
  	   contactdetailssave.click();
    }
    public void ClickOnEmergencyContacts()
    {
  	   WebElement emergencycontacts = ldriver.findElement(emergencycontactsLocator);
  	   emergencycontacts.click();
    }
    public void ClickOnAdd()
    {
  	   WebElement add = ldriver.findElement(addLocator);
  	   add.click();
    }
    public void EnterEmergencyContactsName(String value)
    {
    	WebElement emercontactsname = ldriver.findElement(emercontactsnameLocator);
    	emercontactsname.clear();
    	emercontactsname.sendKeys(value);
    }
    public void EnterEmergencyContactsRelationship(String value)
    {
    	WebElement emercontactsrelationship = ldriver.findElement(emercontactsrelationshipLocator);
    	emercontactsrelationship.clear();
    	emercontactsrelationship.sendKeys(value);
    }
    public void EnterEmergencyContactsHomeTelephone(String value)
    {
    	WebElement emercontactshometelephone = ldriver.findElement(emercontactshometelephoneLocator);
    	emercontactshometelephone.clear();
    	emercontactshometelephone.sendKeys(value);
    }
    public void EnterEmergencyContactsMobile(String value)
    {
    	WebElement emercontactsmobile = ldriver.findElement(emercontactsmobileLocator);
    	emercontactsmobile.clear();
    	emercontactsmobile.sendKeys(value);
    }
    public void EnterEmergencyContactsWorkTelephone(String value)
    {
    	WebElement emercontactsworktelephone = ldriver.findElement(emercontactsworktelephoneLocator);
    	emercontactsworktelephone.clear();
    	emercontactsworktelephone.sendKeys(value);
    }
    public void ClickOnEmergencyContactsSave()
    {
  	   WebElement emercontactssave = ldriver.findElement(emercontactssaveLocator);
  	   emercontactssave.click();
    }
    public void ClickOnCheckbox()
    {
    	WebElement emercontactscheckbox = ldriver.findElement(emercontactscheckboxLocator);
    	emercontactscheckbox.click();
    }
    public void ClickOnDelete()
    {
    	WebElement emercontactsdelete = ldriver.findElement(emercontactsdeleteLocator);
    	emercontactsdelete.click();
    }
}
