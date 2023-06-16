package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebConnect {

	public static void main(String[] args) throws InterruptedException {


		
		
		//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        
		        //dynamic wait
		        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
		        
		        
		        driver.get("https://www.wco.co.in/#!/Login");
		        
		        driver.findElement(By.id("login-email")).sendKeys("9666266663");
		        driver.findElement(By.name("password")).sendKeys("bogavalli2424");
		        driver.findElement(By.xpath("//*[@id=\"form\"]/button")).click();
		        

	}

}
