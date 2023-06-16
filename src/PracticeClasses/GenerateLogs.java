package PracticeClasses;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GenerateLogs {

	public static void main(String[] args) {

		Logger log = Logger.getLogger(GenerateLogs.class);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		
		
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(options);
		
		log.info("lauching browser");
		
		driver.get("http://www.google.com");
		log.info("google url has been launched");
		
		String title = driver.getTitle();
		System.out.println("title valuse is: " + title);
		
		log.info("title valuse is: " + title);
		
		if(title.equals("Google")) {
			System.out.println("correct title is Google");
			log.info("Correct title is Google and test cases is passed");
		}else{
			System.out.println("correct title is not Google");
			log.info("Correct title is not Google and test cases is failed");
		}
		
		

	}

}
