package PracticeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {


		
		//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
		        driver.manage().window().maximize();
		        
		        driver.get("https://jqueryui.com/droppable/");
		        
		        
		        driver.switchTo().frame(0);


		        WebElement sourceElement = driver.findElement(By.id("draggable"));
		        WebElement targetElement = driver.findElement(By.id("droppable"));
		        
		        Actions action = new Actions(driver);
		        
		        action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        

	}

}
