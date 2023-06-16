package PracticeClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ZoomConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.get("https://naveenautomationlabs.com/opencart/");
				
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String zoomChrome = "document.body.style.zoom = '40.0%'"; //chrome, safari, edge
//		
//		//String zoomFirefox = "document.body.style.MozTransform = 'scale(0.4)'; "; //Firefox
//		
//		js.executeScript(zoomChrome);
		
		
		
		
		
		zoomChrome("50.0");
		//zoomFirefox("0.5");
	}
	
	public static void zoomChrome(String zoomPercentage) {
		String zoom = "document.body.style.zoom = '"+zoomPercentage+"%'";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(zoom);
	}
	
	public static void zoomFirefox(String zoomPercentage) {
		String zoom = "document.body.style.zoom = 'scale("+zoomPercentage+")'";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(zoom);
	}

}
