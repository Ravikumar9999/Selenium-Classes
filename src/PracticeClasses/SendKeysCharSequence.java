package PracticeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendKeysCharSequence {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://app.hubspot.com/login");
		
		WebElement email = driver.findElement(By.id("username"));
		
		//1. String
		//email.senkeys("Ravikuma@gmai.com");
		
		//2.StringBuilder
		
//		StringBuilder username = new StringBuilder()
//				.append("Ravi")
//				.append(" ")
//				.append("Kumar")
//				.append(" ")
//				.append("9999");
//		email.sendKeys(username);
		
		
		//3. StringBuffer
		
//		StringBuffer username1 = new StringBuffer()
//				.append("Ravi")
//				.append(" ")
//				.append("Kumar")
//				.append(" ")
//				.append("9999");
//		email.sendKeys(username1);
		
		
		//4.StringBuilder, StringBuffer, String, Keys
		
		StringBuffer username2 = new StringBuffer()
				.append("Ravi")
				.append(" ")
				.append("Kumar")
				.append(" ")
				.append("Selenium");
		
		String space = " ";
		
		StringBuffer userInfo = new StringBuffer()
				.append("Test")
				.append(" ")
				.append("Automation");
		
		String author = " Ravi Kumar";
		
		email.sendKeys(username2, space, userInfo, author, Keys.TAB);
				

	}

}
