package PracticeClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait {
	
	WebDriver driver;

	


		@BeforeMethod
		public void setUp() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://classic.freecrm.com");
			
        }	
    

        @Test
        public void test(WebDriver driver, WebElement element, Duration timeout) {
        
        	WebElement username = driver.findElement(By.name("username"));
        	WebElement password = driver.findElement(By.name("password"));
        	
        	sendKeys(driver, username, 5, "Ravikumar@9999");
    		sendKeys(driver, password, 5, "test@9999");
			
        	//WebElement firstname = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).click();
        // explicit wait - to wait for the compose button to be click-able
        WebDriverWait wait = new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
        
        }

        private void sendKeys(WebDriver driver2, WebElement username, int i, String string) {
			// TODO Auto-generated method stub
			
		}


		@AfterMethod
        public void teardown() {
        // closes all the browser windows opened by web driver
        driver.quit();
        }
}
