package PracticeClasses;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v106.network.Network;
import org.openqa.selenium.devtools.v106.network.model.Headers;
import org.testng.Assert;

public class Auth {
	
	private static final String username = "admin";
	private static final String password = "admin";

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//http://username:password@test.com
		//driver.get("https://the-internet.herokuapp.com/basic_auth");

		DevTools devTools = ((ChromeDriver)driver).getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		String auth = username +  password;
		
		
		String encodeToString = Base64.getEncoder().encodeToString(auth.getBytes());
		System.out.println("Encoded String: " + encodeToString);
		
		
		//send auth header:
		Map<String, Object> headers = new HashMap<>();
		headers.put("Authorization", encodeToString);
		
		devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.cssSelector("p")).getText();
		
		Assert.assertEquals(text, "Congratulations! You must have the proper credentials.");

	}

}
