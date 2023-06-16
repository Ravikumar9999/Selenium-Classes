package PracticeClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ReadPropFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {


		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\src\\practice\\config.properties");
		
		prop.load(ip);
		
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}
//		else if(browserName.equals("FF")) {
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
		driver.get(url);
		
		driver.findElement(By.name(prop.getProperty("fullname_name"))).sendKeys(prop.getProperty("fullname"));
		
		driver.findElement(By.name(prop.getProperty("lastname_name"))).sendKeys(prop.getProperty("lastname"));
		
		driver.findElement(By.name(prop.getProperty("phone_name"))).sendKeys(prop.getProperty("phone"));
		
        driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys(prop.getProperty("email"));
		
		driver.findElement(By.name(prop.getProperty("address_name"))).sendKeys(prop.getProperty("address"));
		
		driver.findElement(By.name(prop.getProperty("city_name"))).sendKeys(prop.getProperty("city"));
		
        driver.findElement(By.name(prop.getProperty("state-name"))).sendKeys(prop.getProperty("state"));
		
		driver.findElement(By.name(prop.getProperty("pincode_name"))).sendKeys(prop.getProperty("pincode"));
		
		Select select = new Select(driver.findElement(By.name(prop.getProperty("country_name"))));
		select.selectByVisibleText("INDIA");
		
        driver.findElement(By.id(prop.getProperty("username_id"))).sendKeys(prop.getProperty("username"));
		
		driver.findElement(By.name(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.name(prop.getProperty("cnfmpassword_name"))).sendKeys(prop.getProperty("cnfmpassword"));
		
		driver.findElement(By.name(prop.getProperty("submit_name"))).click();
		
		

	}

}
