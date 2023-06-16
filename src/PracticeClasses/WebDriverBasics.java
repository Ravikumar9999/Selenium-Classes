package PracticeClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {


		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com"); // enter url
		
		String title = driver.getTitle(); //get the title
		System.out.println("the page title is:" + title);
		
		//validation point
		if(title.equals("Google")) {
			System.out.println("title is correct:");
		}
		else {
			System.out.println("title is not correct");
		}
		
		System.out.println(driver.getCurrentUrl()); // get current url
		
		//System.out.println(driver.getPageSource()); // get page source
		
		driver.quit(); // close the browser
			

	}

}
