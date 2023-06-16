package PracticeClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {

	public static void main(String[] args) throws InterruptedException {


		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //page loading time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //element find out time
        
        driver.get("https://classic.freecrm.com/");
        
        driver.findElement(By.name("username")).sendKeys("Ravikumar@9999");
        driver.findElement(By.name("password")).sendKeys("test@9999");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        driver.switchTo().frame("mainpanel");
        
        String date = "14-February-2023";
        String dateArr[] = date.split("-"); //{14, February, 2023}
        String day = dateArr[0];
        String month = dateArr[1];
        String year = dateArr[2];
        
        Select select = new Select(driver.findElement(By.name("slctMonth")));
        select.selectByVisibleText(month);
        
        Select select1 = new Select(driver.findElement(By.name("slctYear")));
        select1.selectByVisibleText(year);
        
        String beforeXpath ="";
        String afterXpath ="";
        
        final int totalWeekDays = 7;
        
        //2-1 2-2 2-3 2-4 2-5 2-6 2-7
        //3-1 3-3 3-4 3-5 3-6 3-7 
        boolean flag = false;
        for(int rowNum=2; rowNum<7; rowNum++) {
        	
        	for(int colNum = 1; colNum<=totalWeekDays; colNum++) {
        		
        	String dayVal = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
        	System.out.println(dayVal);
        	if(dayVal.equals(day)) {
        		driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
        		flag = true;
        		break;
        	}
        	}
        	
        	if(flag) {
        		break;
        	}
        }
	}

}
