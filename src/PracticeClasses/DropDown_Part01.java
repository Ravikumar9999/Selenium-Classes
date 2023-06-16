package PracticeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Part01 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
//		Select select = new Select(day);
//		select.selectByVisibleText("09");
//		
//		Select select1 = new Select(month);
//		select.selectByVisibleText("August");
//		
//		Select select2 = new Select(year);
//		select.selectByVisibleText("1999");
		
		
		
//		selectValueFromDropDown(day, "9");
//		selectValueFromDropDown(month, "Aug");
//		selectValueFromDropDown(year, "1999");
		
		String dob = "9-Aug-1999";
		String dobArr[] = dob.split("-");
		
		selectValueFromDropDown(day, dobArr[0]);
		selectValueFromDropDown(month, dobArr[1]);
		selectValueFromDropDown(year, dobArr[2]);
		
		

	}
	
	public static void selectValueFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	

}
