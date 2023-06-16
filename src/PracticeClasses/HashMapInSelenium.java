package PracticeClasses;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HashMapInSelenium {

	public static void main(String[] args) {


		//Role based ---> permission based use case
		//category manager user ---> go to the app ---> add all the products
		//customer user ---> go to the app ---> buy aproduct
		//admin user ---> go to the app ---> can see all the orders
		//seller user --->go to the app ---> see only those order which are element
		//distributor ---> go to the app ---> can see the respective order
		//delivery boy ---> go to the app ---> can see the order and deliver the products
		//customer care user ---> go to the app
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://classic.freecrm.com");
//		
//		driver.findElement(By.name("username")).sendKeys("Ravikumar@9999");
//		driver.findElement(By.name("password")).sendKeys("test@9999");
		
		
		System.out.println(getCredentialsMap());
		System.out.println(getCredentialsMap().get("seller"));
		
		
		
		driver.findElement(By.name("username")).sendKeys(getUserName("customer"));
		driver.findElement(By.name("password")).sendKeys(getPassword("customer"));
		
		
	}
	
	public static HashMap<String, String> getCredentialsMap() {
		HashMap<String , String > userMap = new HashMap<String, String>();
		
		userMap.put("customer", "Ravikumar@9999:test@9999");
		userMap.put("admin", "test@123:test@9999");
		userMap.put("distributor", "Ravikumar@09:test@123");
		userMap.put("seller", "Ravikumar:test@9999");
		userMap.put("deliveryboy", "itsme:itsme@09");
		
		return userMap;
	}
	
	public static String getUserName(String role) {
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[0];
	}
	
	public static String getPassword(String role) {
		String credentials = getCredentialsMap().get(role);
		return credentials.split(":")[1];
	}

}
