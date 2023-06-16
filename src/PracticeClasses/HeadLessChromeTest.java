package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChromeTest {

	public static void main(String[] args) throws InterruptedException {


		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\SikuliTest\\Drivers\\chromedriver.exe");
		
		//mandatory options:
		//1. chrome version should be greater than 59 on mac and greater than 60 on window
		//2. window -size=1400,800
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		WebDriver driver = new ChromeDriver(options);
		
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
        
        driver.get("https://classic.freecrm.com/");
        
        System.out.println("Login page Title=="+driver.getTitle());
        
        driver.findElement(By.name("username")).sendKeys("Ravikumar@9999");
        driver.findElement(By.name("password")).sendKeys("test@9999");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
        
        System.out.println("Home page Title=="+driver.getTitle());
	}

}
