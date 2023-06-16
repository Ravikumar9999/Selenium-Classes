package PracticeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://login.yahoo.com");
        
        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("testadmin@yahoo.com");

       
	}

}
