package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {

	public static void main(String[] args) throws InterruptedException {


		
		//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        
		        //dynamic wait
		        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
		        
		        driver.get("https://classic.freecrm.com/");
		        
		        driver.findElement(By.name("username")).sendKeys("Ravikumar@9999");
		        driver.findElement(By.name("password")).sendKeys("test@9999");
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		        
		        driver.switchTo().frame("mainpanel");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		        
		        driver.findElement(By.xpath("//a[contains(text(),'R Kumar')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		        
		        
		        
		        

	}

}
