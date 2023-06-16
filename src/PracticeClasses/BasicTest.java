package PracticeClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BasicTest {
	
	public String baseUrl = "https://www.browserstack.com/";
	String driverPath = "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe";
	WebDriver driver;
	
	
	
	
//  @BeforeTest
//  public void launchBrowser() {
//	  System.out.println("launching Chrome browser");
//	  System.setProperty("webdriver.chrome.driver", driverPath);
//	  driver = new ChromeDriver();
//	  driver.get(baseUrl);
//	  }
//  
//  
//  @Test
//	public void verifyHomepageTitle() {
//	String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
//	String actualTitle = driver.getTitle();
//	Assert.assertEquals(actualTitle, expectedTitle);
//	}
//	
//	
//	@Test
//	public void verify() {
//		System.out.println("Hello");
//	
//	}
//	
//
//  @AfterTest
//  public void terminateBrowser(){
//  driver.close();
//  }
	
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("excuteing before suite");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("excuteing after suite");
	}
	
	@BeforeTest
	public void beforeytest() {
		System.out.println("excuteing before test");
	}
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("excuteing after test");
	}
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("excuteing before class");
	}
	
	
	@AfterClass
	public void afterclass() {
		System.out.println("excuteing after class");
	}
	
	
	
	
	@Test(priority=2,dependsOnMethods="test5")
	public void test3() {
	System.out.println("3rd test");
	}
	
	@Test(priority=1)
	public void test4() {
	System.out.println("4th test");
	}
	
	@Test(priority=3)
	public void test5() {
	System.out.println("5th test");
	}
	


}
