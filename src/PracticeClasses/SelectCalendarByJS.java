package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SelectCalendarByJS {

	public static void main(String[] args) {



		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
        
        driver.get("https://www.airindia.in/");
        
        WebElement date = driver.findElement(By.id("_depdateeu1"));
        String dateVal = "23-01-2023";
        
        WebElement element = null;
		String dataVal = null;
		selectDateByJS(driver, element, dataVal);
        
        
	}

	
	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		JavaScriptExecutor js = ((JavaScriptExecutor) driver);
		//js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	}
}
