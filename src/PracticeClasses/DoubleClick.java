package PracticeClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {


		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
		
		
		
        Actions action = new Actions(driver);
        WebElement doubleClickBtn = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        System.out.println(doubleClickBtn);
        action.doubleClick(doubleClickBtn).build().perform();
        
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
	}

}
