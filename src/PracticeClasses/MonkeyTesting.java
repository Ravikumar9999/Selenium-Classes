package PracticeClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MonkeyTesting {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.amazon.com");
		
		List<WebElement> FooterLinks = driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
		int footerCount = FooterLinks.size();
		System.out.println("Total footer Links: " + footerCount);
		for (int i=0; i<footerCount; i++) {
			
			int randomindex = (int)Math.floor(Math.random() * footerCount);
			System.out.println(randomindex);
			
			WebElement e = FooterLinks.get(randomindex);
			System.out.println(e.getText());
			e.click();
			
			driver.navigate().back();
			Thread.sleep(1500);
			FooterLinks = driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
			
		}

	}

}
