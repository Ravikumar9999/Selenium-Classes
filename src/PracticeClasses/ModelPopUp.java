package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModelPopUp {

	public static void main(String[] args) throws InterruptedException {


		
		//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        
		        //dynamic wait
		        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
		        
		        driver.get("https://classic.freecrm.com");
		        
		        driver.findElement(By.name("username")).sendKeys("Ravikumar@9999");
		        driver.findElement(By.name("password")).sendKeys("test@9999");
		        
		        driver.switchTo().frame("intercom-messenger-frame");
		        
		        Actions action = new Actions(driver);
		        action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'intercom-g6vfuv e1dst0fh3')]"))).build().perform();
		        
		        driver.findElement(By.xpath("//div[contains(@aria-label,'Dismiss')]//span")).click();
		        
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//input[@type='submit']")).click();
		        
		        String homeTitle = driver.getTitle();
		        System.out.println(homeTitle);
		        
		        
		        
		        
		        
		        
		        

	}

}
