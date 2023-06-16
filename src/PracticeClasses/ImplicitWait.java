package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {


		
		//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.ebay.com/");
		        driver.manage().window().maximize();
		        
		        //dynamic wait
		        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time

	}

}
