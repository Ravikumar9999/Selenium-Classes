package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {


		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
        //get() vs navigate().to()
        driver.get("https://www.google.com");
        
        driver.navigate().to("https://www.amazon.com");
        
        //back and forward buttons simulation
        driver.navigate().back(); //Goolge
        Thread.sleep(3000);
        driver.navigate().forward(); //Amazon
        Thread.sleep(3000);
        driver.navigate().back(); //Google
        driver.navigate().refresh();

	}

}
