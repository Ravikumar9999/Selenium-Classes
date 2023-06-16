package PracticeClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDown_Part03 {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		String day_xpath = "//select[@id='day']//option";
		String month_xpath = "//select[@id='month']//option";
		String year_xpath = "//select[@id='year']//option";
		
		selectDwopDownValue(day_xpath, "9");
		selectDwopDownValue(month_xpath, "Aug");
		selectDwopDownValue(year_xpath, "1999");
		
	}
		
		public static void selectDwopDownValue(String xpathValue, String value) {
			List <WebElement> monthList = driver.findElements(By.xpath(xpathValue));
			System.out.println(monthList.size());
			
			for (int i=0; i<monthList.size(); i++) {
				System.out.println(monthList.get(i).getText());
				if(monthList.get(i).getText().equals(value)) {
					monthList.get(i).click();
					break;
				}
			}
		

	}

}
