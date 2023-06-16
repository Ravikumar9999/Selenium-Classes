package PracticeClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {


		//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
				
				driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		        driver.manage().window().maximize();
		        
		        Actions action = new Actions(driver);
		        
		        WebElement rightClickBtn =driver.findElement(By.cssSelector(".context-menu-one"));
		        
		        action.contextClick(rightClickBtn).build().perform();
		        
		        
		        WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		        String copyText = copy.getText();
		        System.out.println(copyText);
		        copy.click();
		        
		        Alert alert = driver.switchTo().alert();
		        System.out.println(alert.getText());
		        alert.accept();
		        
		        
	}
 
}
