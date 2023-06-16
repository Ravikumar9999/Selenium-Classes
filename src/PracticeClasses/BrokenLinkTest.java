package PracticeClasses;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class BrokenLinkTest {
	

	public static void main(String[] args) throws InterruptedException,  IOException {


		
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
        
        driver.get("https://classic.freecrm.com/");
       
        driver.findElement(By.name("username")).sendKeys("Ravikumar@9999");
        driver.findElement(By.name("password")).sendKeys("test@9999");
       
        Thread.sleep(3000);
        WebElement LoginButton = driver.findElement(By.xpath("//input[@type='submit' and @value='Login']"));
        LoginButton.click();
        
        driver.switchTo().frame("mainpanel");
       
        
        
        //links -- a href<http://www.google.com>
        //images -- img 
        
        
        //1. get the list of all the links and images
        List<WebElement> linksList = driver.findElements(By.tagName("a"));
        linksList.addAll(driver.findElements(By.tagName("img")));
        System.out.println("size of active links and images---->" +linksList.size());
        
        
        List<WebElement> activeLinks = new ArrayList<WebElement>();
        
         
        //2. iterate linkList: exclude all the links/images -- doesnt have any href attribute
        for(int i=0; i<linksList.size(); i++) {
        	System.out.println(linksList.get(i).getAttribute("href"));
        	if(linksList.get(i).getAttribute("href") != null && linksList.get(i).getAttribute("href").contains("javascript")) {
        		activeLinks.add(linksList.get(i));
        	}
        }        
        //get the size of active links list:
        System.out.println("Size of active links and images---->" +activeLinks.size());
        
        
        //3. check the href url, with httpconnection api:
        //200 -- ok
        //404 -- not found
        //500 -- internal error
        //400 -- bad request
        for(int j=0; j<activeLinks.size(); j++) {
        	
        	HttpURLConnection connection = (HttpURLConnection)	new URL(activeLinks.get(j).getAttribute("href")).openConnection();
        	
        	connection.connect();
        	String response = connection.getResponseMessage();  //ok
        	connection.disconnect();
        	System.out.println(activeLinks.get(j).getAttribute("href") +"----->"+response);
        }

	}

}
