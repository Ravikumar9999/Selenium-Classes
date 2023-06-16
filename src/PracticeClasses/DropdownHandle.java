package PracticeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	public static void main(String[] args) {
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAVI KUMAR\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("Ravi Kumar");
        driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("@gmailKumar.com");
        driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("12345");
        driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("12345");
        driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[14]/td/div/table/tbody/tr[1]/td[3]/input")).sendKeys("Kumar1234@gmail.com");
        
      //handle dropdown
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
        select.selectByVisibleText("09");
        
        Select select1 = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")));
        select1.selectByVisibleText("AUG");
        
        Select select2 = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")));
        select2.selectByVisibleText("1999");
        
        
      //handle dropdown
        Select select3 = new Select(driver.findElement(By.id("country")));
        select3.selectByVisibleText("Bhutan");
        
        
      
        
        
        
        
        
        
        
//        Select select = new Select(driver.findElement(By.id("UserTitle-025z")));
//        select.selectByVisibleText("Developer");
//        driver.findElement(By.id("UserEmail-Fa9M")).sendKeys("rk@gmail.com");
//        driver.findElement(By.id("CompanyName-WLl1")).sendKeys("ARK Creative Sparks");
//       Select select1 = new Select(driver.findElement(By.id("CompanyEmployees-2pTA")));
//       select1.selectByVisibleText("9");
//
//       driver.findElement(By.id("UserPhone-P9ef")).sendKeys("8886688213");
//       Select select2 = new Select(driver.findElement(By.id("CompanyCountry-x8bJ")));
//       select2.selectByVisibleText("US");
	}

	private static Select Select(WebElement findElement) {
		// TODO Auto-generated method stub
		return null;
	}

}
