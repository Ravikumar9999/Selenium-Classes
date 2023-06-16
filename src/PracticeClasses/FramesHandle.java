package PracticeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesHandle {

	public static void main(String[] args) throws InterruptedException {


		//Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		        driver.manage().window().maximize();
		        
		        //Main Document
		        driver.findElement(By.id("name")).sendKeys("Test1");
		        Thread.sleep(5000);
		        
		        //frame1
		        driver.switchTo().frame("frm1");
		        Select courseName_dd = new Select(driver.findElement(By.id("course")));
		        courseName_dd.selectByVisibleText("Java");
		        Thread.sleep(5000);
		        
		      //Main Document
		        driver.switchTo().defaultContent();

		        //frame2
		        driver.switchTo().frame("frm2");
		        driver.findElement(By.id("firstName")).sendKeys("Ravi Kumar");
		        Thread.sleep(5000);
		        
		      //Main Document
		        driver.switchTo().defaultContent();
		        
		      //frame1
		        driver.switchTo().frame("frm1");
		        courseName_dd.selectByVisibleText("Dot Net");
		        Thread.sleep(5000);
		        
		        
		      //Main Document
		        driver.switchTo().defaultContent();
		        driver.findElement(By.id("name")).clear();
		        driver.findElement(By.id("name")).sendKeys("Test2");
		        
		      //frame3
		        driver.switchTo().frame("frm3");
		        driver.findElement(By.id("name")).sendKeys("Kumar");
		        Thread.sleep(5000);
		        
//		      //Main Document
//		        driver.switchTo().defaultContent();
		        
		      //frame3(frame 2)
		        driver.switchTo().frame("frm2");
		        driver.findElement(By.id("lastName")).sendKeys("Ravi");
		        Thread.sleep(5000);
		        
		      //Main Document
		        driver.switchTo().defaultContent();
		        
		      //frame3
		        driver.switchTo().frame("frm3");
		        
		      //frame3(frame 1)
		        driver.switchTo().frame("frm1");
		        Select courseName_dd2 = new Select(driver.findElement(By.id("selectnav1")));
		        courseName_dd2.selectByVisibleText("-- CSS Selectors");
		        
		      
		        
		        
		        
		        
		        
		        
		        
		        

	}

}
