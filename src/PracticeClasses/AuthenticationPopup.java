package PracticeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AuthenticationPopup {

	public static void main(String[] args) {


		
		//Chrome:
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
				
				//http://username:password@test.com
				driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
				
				String pageMessage = driver.findElement(By.cssSelector("p")).getText();
				System.out.println(pageMessage);

	}

}
