package PracticeClasses;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {


		
		        //Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        
		        //dynamic wait
		        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
		        
		        driver.get("https://www.facebook.com");
		        
		        // 1. take screenshot and store it as a file format:
	            File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            // 2. now copy the screenshot to desire location using copyfile method:
		        Files.copy(src, new File("C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\src\\practice\\facebook.jpg"));

	}

}
