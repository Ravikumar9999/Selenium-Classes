package PracticeClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarDataPickerHandleHYR {

	public static void main(String[] args) throws Exception {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
//		
//		
//		int day = 26;
//		
//		//First calendar
//		driver.findElement(By.id("first_date_picker")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
//		
//		//Second calendar
//		driver.findElement(By.id("second_date_picker")).click();
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+day+"]")).click();
		
		driver.findElement(By.id("first_date_picker")).click();
		selectDate(driver, "23/Feb/2020");
		
		driver.findElement(By.id("second_date_picker")).click();
		selectDate(driver, "23/Feb/2025");
	}
	
	public static void selectDate(WebDriver driver, String date) throws Exception {
		Calendar calendar = Calendar.getInstance();
		try {
			SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
			targetDateFormat.setLenient(false);
			Date formattedTargetDate = targetDateFormat.parse(date);
			calendar.setTime(formattedTargetDate);
		} catch (Exception e) {
			throw new Exception("Invalid date is provided, please check the input date!!");
		}
			int targetMonth = calendar.get(calendar.MONTH);
			int targetYear = calendar.get(calendar.YEAR);
			int targetDay = calendar.get(calendar.DAY_OF_MONTH);
		
			//April 2023
			String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
			int currentMonth = calendar.get(calendar.MONTH);
			int currentYear = calendar.get(calendar.YEAR);
			
			//Future Date
			while(currentMonth < targetMonth || currentYear < targetYear) {
				driver.findElement(By.className("ui-datepicker-next")).click();
				currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
				currentMonth = calendar.get(calendar.MONTH);
				currentYear = calendar.get(calendar.YEAR);
			}
			
			//Previcous Date
			while(currentMonth > targetMonth || currentYear > targetYear) {
				driver.findElement(By.className("ui-datepicker-prev")).click();
				currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
				currentMonth = calendar.get(calendar.MONTH);
				currentYear = calendar.get(calendar.YEAR);
			}
			if(currentMonth == targetMonth && currentYear == targetYear)
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+targetDay+"]")).click();
			else
				throw new Exception("unable select the date because of current and target dates mismatch");
	}

}
