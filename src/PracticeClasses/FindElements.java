package PracticeClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {


		
		        //Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        
		        //dynamic wait
		        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
		        
		        driver.get("https://www.facebook.com/");
		        
		        //1. get the total count of links on the page
		      //all the links are represented by <a> html tag:
		         List <WebElement> linkList = driver.findElements(By.tagName("a"));
       
		        // size of linkList:
		        System.out.println(linkList.size());
		       
		        //2. get the text of each links on the page
		       
		         for(int i=0; i<linkList.size(); i++) {
		    	    String linkText =  linkList.get(i).getText();
		    	      System.out.println(linkText);
		       }
        
        

	}

}
