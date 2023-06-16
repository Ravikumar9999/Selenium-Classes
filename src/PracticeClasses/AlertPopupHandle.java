package PracticeClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
				
			
				
				 ChromeOptions options = new ChromeOptions();
				 options.addArguments("--remote-allow-origins=*");
				 
				WebDriver driver = new ChromeDriver(options);
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		        driver.manage().window().maximize();
		        
		        //click on Go button
		        driver.findElement(By.name("proceed")).click();
		        Thread.sleep(5000);
		        
		       Alert alert = driver.switchTo().alert();
		       System.out.println(alert.getText());
		       
		       String text = alert.getText();
		       
		       if(text.equals("Please enter a valid user name")) {
		    	   System.out.println("Correct alert msg");
		       }
		       else {
		    	   System.out.println("In Correct alert msg");
		       }
		      
		    	   
		    	   
		    	   
		        alert.accept(); //click on OK button
		    	//alert.dismiss(); //click on cancel button
		        

	}

}
