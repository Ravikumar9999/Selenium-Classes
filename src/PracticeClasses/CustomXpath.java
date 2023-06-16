package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {


		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
        
        driver.get("https://www.ebay.com/");
        
        //driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
        
        //driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");
        
        driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Javaa");
        
        
        //dynamic id: input
        //id = test_123
        //By.id("test_123")
        //id = test_456
        //id = test_789
        //id = test_test-456
        //id = test_789_test
        //driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
        //driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Test1");
        
        //id = 456_test_t
        //id = 789_test_t
       //driver.findElement(By.xpath("//input[ends-with(@id,'test_')]")).sendKeys("Test1");
        
        
        
        //for links: custom xpath:
        //all the links are represented by <a> html tag:
        driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();

	}

}
