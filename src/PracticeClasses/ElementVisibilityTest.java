package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {


		
		

        //Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
        
        driver.get("https://classic.freecrm.com/register/");
        
        //1. isDisplayed() method: applicable for all the elements
        boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed();
        System.out.println(b1);  //true
        
        //2. isEnabled() method: 
        boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
        System.out.println(b2); // false
        
        //select I Agree button
        driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[11]/div/label/input")).click();  //---submit button is enabled now
        boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
        System.out.println(b3); // true
        
        //3. isSelected() method: only applicable for checkbox, dropdown, radiobutton
        boolean b4 = driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[11]/div/label/input")).isSelected();
        System.out.println(b4); //true
        
        //de-select the checkbox:
        driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[11]/div/label/input")).click();
        boolean b5 = driver.findElement(By.xpath("//*[@id=\"multipleForm\"]/div[11]/div/label/input")).isSelected();
        System.out.println(b5); //false
        
       
	}

}
