package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlUnitDriver {

	public static void main(String[] args) {


		
		 //Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//htmlunitdriver is not available in Selenium 3.x Version
		//Advantages:
		//1. testing is happening behind the scene --- no brows
		//2. Very fast --- execution of test cases --- very fast -- performance of the script
		//3 not suitable for Actions class -- mousemovement, doubleClick, drog and drop
		//4. Ghost driver  ---  HeadLess browser
		    //HtmlUnit Driver-  Java
		    //PhantomJS -- JavaScript
		WebDriver driver = (WebDriver) new HtmlUnitDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
        
        driver.get("https://classic.freecrm.com/");
        
        System.out.println("Before login title is:==="+driver.getTitle());
        
        driver.findElement(By.name("username")).sendKeys("Ravikumar@9999");
        driver.findElement(By.name("password")).sendKeys("test@9999");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        System.out.println("After login title is:==="+driver.getTitle());
        

	}

}
