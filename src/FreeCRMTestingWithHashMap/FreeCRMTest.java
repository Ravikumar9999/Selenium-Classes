package FreeCRMTestingWithHashMap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCRMTest {
	WebDriver driver;
	public String credentials;
	public String credentialsInfo[];

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://classic.freecrm.com");
		
	}	
		
		@Test(priority=1)
		public void loginWithAdminUserTest() throws InterruptedException {
			credentials = Data.getUserLoginInfo().get("admin");
			credentialsInfo =credentials.split("_");
			
			driver.findElement(By.name("username")).sendKeys(credentialsInfo[0]);
			driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).click();
			
			Thread.sleep(3000);
			
			driver.switchTo().frame("mainpanel");
			
			// Select Month
			Select select = new Select(driver.findElement(By.name("slctMonth")));
			select.selectByVisibleText(Data.monthMap().get(8));
			
			
		}
		
		
		@Test(priority=2)
		public void loginWithAdminCustomerTest() {
			credentials = Data.getUserLoginInfo().get("customer");
			credentialsInfo =credentials.split("_");
			
			driver.findElement(By.name("username")).sendKeys(credentialsInfo[0]);
			driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).click();
		}
		
		
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	

}
