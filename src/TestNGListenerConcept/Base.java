package TestNGListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	
	public static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("http://www.google.com");
	}
	
	
	public void failed(String testMethodName)  {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		//FileUtils.copyFile(srcFile, new File("C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\screenshots\\testFailure.jpg"));
			FileUtils.copyFile(srcFile, new File("C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\screenshots\\"+testMethodName+"_"+".png"));
	}catch (IOException e) {
		e.printStackTrace();
	}
   }
}
