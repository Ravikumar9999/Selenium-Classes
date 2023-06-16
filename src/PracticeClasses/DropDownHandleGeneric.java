package PracticeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandleGeneric {
	
	static WebDriver driver;

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		
		//driver.findElement(By.xpath("//a[@role='button' and @id='u_0_0_ZI']")).click();
		
		By month = By.id("month");
		By year = By.id("year");
		
//		Select select1 = new Select(driver.findElement(country));
//		select1.selectByVisibleText("India");
		
//		doSelectByVisibleTest(month, "Mar");
//		doSelectByVisibleTest(year, "2020");
		
		selectDropDownValue(year, "index", "5");
		selectDropDownValue(month, "visibletext", "Aug");
	}
	
	
	public static void selectDropDownValue(By locator, String type, String value) {
		
		Select select = new Select(getElement(locator));
		
		switch (type){
		case "index":
			select.selectByIndex(Integer.parseInt(value));
		    break;
		    
		case "value":
			select.selectByValue(value);
		    break;
		    
		case "visibletext":
			select.selectByVisibleText(value);
		    break;    
		    
		default:
			System.out.println("please pass the correct selection criteria...");
			break;
		
		}
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByVisibleTest(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}

	
	public static void doSelectByVisibleIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	
	public static void doSelectByVisibleValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
}
