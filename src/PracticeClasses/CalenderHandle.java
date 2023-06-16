package PracticeClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CalenderHandle {

	public static void main(String[] args) {

    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/");

        //Find the date time picker control
        WebElement dateBox = driver.findElement(By.xpath("//input[@name='bdaytime']"));

        //Fill date as mm/dd/yyyy as 09/25/2013
        dateBox.sendKeys("09252013");

        //Press tab to shift focus to time field
        dateBox.sendKeys(Keys.TAB);

        //Fill time as 02:45 PM
        dateBox.sendKeys("0245PM");

    }

    }
