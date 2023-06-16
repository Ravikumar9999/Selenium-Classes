package PracticeClasses;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class ImageDisableOptions {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		disableImageChrome(options);
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.amazon.in");
		System.out.println(driver.getTitle());
		
		
//		FirefoxOptions options1 = new FirefoxOptions();
//		disableImageFirefox(options1);
//		WebDriver driver1 = new FirefoxDriver(options1);
//		driver1.get("http://www.amazon.in");
//		System.out.println(driver1.getTitle());
	}
	
	
	public static void disableImageChrome(ChromeOptions options) {
		HashMap<String, Object> images = new HashMap<String, Object>();
		images.put("images", 2);
		
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values", images);
		
		options.setExperimentalOption("prefs", prefs);
	}
	
	
//	public static void disableImageFirefox(FirefoxOptions options) {
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("permissions.default.image", 2);
//		options.setProfile(profile);
//		options.setCapability(FirefoxDriver.PROFILE, profile);
//	}

}
