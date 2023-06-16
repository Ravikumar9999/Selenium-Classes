package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank {

	public static void main(String[] args) {

		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
        
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
       
        driver.findElement(By.id("customer.firstName")).sendKeys("Ravi");
        driver.findElement(By.id("customer.lastName")).sendKeys("Kumar");
        driver.findElement(By.id("customer.address.street")).sendKeys("Panduranga Nagar,Hyderguda");
        driver.findElement(By.id("customer.address.city")).sendKeys("Hyderabad");
        driver.findElement(By.id("customer.address.state")).sendKeys("Telangana");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("500040");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("8886688213");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.id("customer.username")).sendKeys("Ravikumar@9999");
        driver.findElement(By.id("customer.password")).sendKeys("test@9999");
        driver.findElement(By.id("repeatedPassword")).sendKeys("test@9999");
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        driver.getTitle();

	}

}
