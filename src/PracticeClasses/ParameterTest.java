package PracticeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url", "emailId", "emailPwd"})
	public void yahooLoginTest( String url, String emailId, String emailPwd) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(emailId); //enter username
		driver.findElement(By.id("login-signin")).click(); //click on next button
		driver.findElement(By.id("login-passwd")).sendKeys(emailPwd);
		driver.findElement(By.id("login-signin")).click();
		
		
	}

}