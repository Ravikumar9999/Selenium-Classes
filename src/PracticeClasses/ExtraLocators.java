package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExtraLocators {

	public static void main(String[] args) {

 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
				
		driver.get("https://www.facebook.com/login");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.findElement(new ByAll(By.name("firstname123"), By.id("u_i_b_Umgig"), By.xpath("//input[@name='firstname']"))).sendKeys("Ravikumar");
		//driver.findElement(new ByIdOrName("firstname")).sendKeys("Ravikumar");
		driver.findElement(new ByChained(By.id("u_0_a_vT"),
				By.xpath("//dive[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"),
				By.name("firstname"))).sendKeys("Ravikumar");
		

	}

}
