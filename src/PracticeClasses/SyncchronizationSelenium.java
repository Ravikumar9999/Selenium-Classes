package PracticeClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncchronizationSelenium {

	public static void main(String[] args) {


		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		//Implicitly wait -- is always applied globally -- is available for all the webelements
		//dynamic nature
		//
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement lastname = driver.findElement(By.name("lastname"));
		WebElement mobileNum = driver.findElement(By.name("firstname"));
		WebElement password = driver.findElement(By.name("lastname"));
		
		
		sendKeys(driver, firstname, 10, "Tom");
		sendKeys(driver, lastname, 5, "Peter");
		sendKeys(driver, mobileNum, 5, "9876543210");
		sendKeys(driver, password, 10, "test@213");
		
		WebElement forgetAccount = driver.findElement(By.linkText("Forgetten Account?"));
		clickOn(driver, forgetAccount, 5);
	}
	private static void clickOn(WebDriver driver, WebElement forgetAccount, int i) {
		// TODO Auto-generated method stub
		
	}



	private static void sendKeys(WebDriver driver, WebElement firstname, int i, String value) {
		// TODO Auto-generated method stub
		
	}
	//Explicit Wait
	//1. no explicit keyword or method
	//2. available with WebDriverWait with some ExpectedConditions
	//3. specific to element
	//4. dynamic in nature
	//5. We should never use implict wait and explicut wait together:
	//----->selenium WD will wait for the eleement first because of IMPLICIT WAITand then EXLPICIT WAIT will be applied
	//hence, total sync wait will be increased for each element 
	public static void sendKeys(WebDriver driver, WebElement element, Duration timeout, String value) {
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
	
	
	public static void clickOn(WebDriver driver, WebElement element, Duration timeout) {
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	
	

}
