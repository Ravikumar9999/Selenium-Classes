package PracticeClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarDataPickerHandle01 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

        driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
        
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        
        driver.findElement(By.id("datepicker")).click();
        
        //Explicit Wait
        new WebDriverWait(driver, Duration.ofSeconds(5))
            .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
        
        String monthYearValue = driver.findElement(By.className("ui-datepicker-title")).getText();
        System.out.println(monthYearValue); //April 2023
        String month = monthYearValue.split(" ")[0].trim();
        String year = monthYearValue.split(" ")[1].trim();
        
        while(!(month.equals("August") && year.equals("2025"))) {
        	driver.findElement(By.xpath("//a[@title='Next']")).click();
        	
        	 monthYearValue = driver.findElement(By.className("ui-datepicker-title")).getText();
            System.out.println(monthYearValue); //April 2023
             month = monthYearValue.split(" ")[0].trim();
             year = monthYearValue.split(" ")[1].trim();
        }
        
        driver.findElement(By.xpath("//a[text()='9']")).click();
	}
	
	public static void selectDate(String exDay, String exMonth, String exYear) {
		
		
	}

}
