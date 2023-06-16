package PracticeClasses;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException {


		
		        //Chrome Browser
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        
		        //dynamic wait
		        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
		        
		        driver.get("https://classic.freecrm.com/login.cfm");
		        
		        
		        driver.findElement(By.name("username")).sendKeys("Ravikumar@9999");
		        driver.findElement(By.name("password")).sendKeys("test@99919");
		        //driver.findElement(By.xpath("//input[@type='submit']")).click();
		        
		        //executeScript -- to execute JavaScript code
		        
		        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		      //highlight the element
		        flash(loginBtn, driver); //highlight the element
		        
		      //draw a border
		        drawBorder(loginBtn, driver); 
		        

//		        //Take Screenshot and store as a file format
//	            File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		        // now copy the screenshot to desired location using copy //Method
//		        Files.copy(src, new File("C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\src\\practice\\element.jpg"));
		        
		        
		        //Generate Alert
		        //generateAlert(driver, "There is an issue with Login button on Login Page");
		        
		        
		        //Click on any element by using JavascriptExecutor
		        clickButtonByJS(loginBtn, driver);
		        
//		        //Refresh the page
//		        //1. by using selenium
//		        driver.navigate().refresh();
//		        //2. by using JavascriptExecutor
//		        refreshBrowserByJS(driver);
		        
		        
		        //get the title of the page by JS
		        System.out.println(getTitleByJS(driver));
		        
		        
		        //get the page text
		        System.out.println(getPageInnerText(driver));
		        
//		        //scroll page down
//		        scrollPageDown(driver);
		        
		        //scroll into view(element)
		        WebElement forgetPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?']"));
		        scrollIntoView(forgetPwdLink, driver);
		        
		        
		     
	}
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for(int i =0; i < 20; i++) {
			changeColor("rgb(0,200,0)", element,driver);
			changeColor(bgcolor, element,driver);
		}
		
	}
	//highlight the element
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
	}
	
	
	
	
	}
	
	//draw a border
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	//Generate Alert
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
	}
	
	//Click on any element by using JavascriptExecutor
	public static void clickButtonByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	//Refresh the page
	public static void refreshBrowserByJS(WebDriver driver) {
		JavaScriptExecutor js = ((JavaScriptExecutor)driver);
		js.executeScript("history.go(0)");
	}

	private void executeScript(String string) {
		// TODO Auto-generated method stub
		
	}
	
	//get the title of the page by JS
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	//get the page text
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText").toString();
		return pageText;
	}
	
	//page scrolling
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	
	
	
	
	}
