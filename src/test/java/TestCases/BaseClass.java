package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void SetUp(String browser) throws Exception{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\anikmahajan\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\Browsers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else
		{
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String expected_title="OrangeHRM";
		String actual_title=driver.getTitle();
		String expected_url="https://opensource-demo.orangehrmlive.com/";
		String actual_url=driver.getCurrentUrl();
		Assert.assertEquals(expected_title, actual_title);
		Assert.assertEquals(expected_url, actual_url);
	}
	@AfterClass
	public void TearDown()
	{
		driver.quit();
	}
}
