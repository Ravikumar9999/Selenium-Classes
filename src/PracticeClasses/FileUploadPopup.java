package PracticeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {


		        //Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				//driver.get("https://html.com/input-type-file/");
				driver.get("http://demo.guru99.com/test/upload/");
		        driver.manage().window().maximize();
		        
		        
		        //driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\RAVI KUMAR\\Downloads\\Joyful.jpg");
		        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\RAVI KUMAR\\Downloads\\Joyful.jpg");
		        
		        //driver.quit();

	
	
	
	
	}

}
