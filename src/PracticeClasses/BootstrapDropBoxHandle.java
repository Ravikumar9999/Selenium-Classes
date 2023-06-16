package PracticeClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxHandle {

	public static void main(String[] args) {


		
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
        
        driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
        
        List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
        
        System.out.println(list.size());
        
        
        //selecting all the checkboxes/options
        for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i).getText());
        	list.get(i).click();
        	
        }
        
        
       
        //selecting Angular option
//        for(int i=0; i<list.size(); i++) {
//        	System.out.println(list.get(i).getText());
//        	if(list.get(i).getText().contains("Angular")) {
//        		list.get(i).click();
//        		break;
//        	}
//        }
        
        //selecting HTML
        for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i).getText());
        	if(list.get(i).getText().contains("HTML")) {
        		list.get(i).click();
        		break;
        	}
        }
        
        //selecting CSS
        for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i).getText());
        	if(list.get(i).getText().contains("CSS")) {
        		list.get(i).click();
        		break;
        	}
        }

	}

}
