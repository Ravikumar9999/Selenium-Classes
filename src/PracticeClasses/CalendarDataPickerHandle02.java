package PracticeClasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarDataPickerHandle02 {
	public static WebDriver driver;

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

        driver.get("https://jqueryui.com/datepicker/#date%E2%88%92range");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("datepicker")).click();
        
        new WebDriverWait(driver, Duration.ofSeconds(5))
            .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
        
        selectDate("20", "March", "2024");
	}
	
	public static String[] getMonthYear(String monthYearValue) {
		return monthYearValue.split(" ");
	}
	
	public static void selectDate(String exDay, String exMonth, String exYear) {
		
		if(exMonth.equals("February") && Integer.parseInt(exDay)>29) {
			System.out.println("wrong date: " + exMonth + " : " + exDay);
			return;
		}
		
		if(Integer.parseInt(exDay)>31) {
			System.out.println("wrong date: " + exMonth + " : " + exDay);
			return;
		}
		
		String monthYearValue = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthYearValue);
		
		while(!(getMonthYear(monthYearValue)[0].equals(exMonth) 
        		&&
        		getMonthYear(monthYearValue)[1].equals(exYear))) {
        	driver.findElement(By.xpath("//a[@title='Next']")).click();
        	monthYearValue = driver.findElement(By.className("ui-datepicker-title")).getText();
            
        }
        try {
        	driver.findElement(By.xpath("//a[text()='"+exDay+"']")).click();
        }
        catch (Exception e) {
        	System.out.println("wrong date: " + exMonth + " : " + exDay);
        }
        
	}

}
