package PracticeClasses;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTableHandle {

	public static void main(String[] args) {


		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		
	
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
        driver.manage().window().maximize();

        
      //*[@id="customers"]/tbody/tr[2]/td[1]
      //*[@id="customers"]/tbody/tr[3]/td[1]
      //*[@id="customers"]/tbody/tr[4]/td[1]
      //*[@id="customers"]/tbody/tr[7]/td[1]
        
        
        
        
        
        String beforeXpath_company = "//*[@id=\"customers\"]/tbody/tr[";
        String afterXpath_company = "]/td[1]";
        
        String beforeXpath_contact = "//*[@id=\"customers\"]/tbody/tr[";
        String afterXpath_contact = "]/td[2]";
       
        String beforeXpath_country = "//*[@id=\"customers\"]/tbody/tr[";
        String afterXpath_country = "]/td[3]";
        
//        List <WebElement> rows =  (List<WebElement>) driver.findElement(By.xpath("//table[@id='customers']//tr"));
//        System.out.println("total number of row: " + (rows.size()-1));
//        int rowCount = rows.size();
        
        
        
        
        for(int i=2; i<=7; i++) {
        	String actualXpath_company = beforeXpath_company + i + afterXpath_company;
        	String companyName = driver.findElement(By.xpath(actualXpath_company)).getText();
        	System.out.println(companyName);
        	
        	String actualXpath_contact = beforeXpath_contact + i + afterXpath_contact;
        	String contactName = driver.findElement(By.xpath(actualXpath_contact)).getText();
        	System.out.println(contactName);
        	
        	String actualXpath_country = beforeXpath_country + i + afterXpath_country;
        	String countryName = driver.findElement(By.xpath(actualXpath_country)).getText();
        	System.out.println(countryName);
        }
	}

}
