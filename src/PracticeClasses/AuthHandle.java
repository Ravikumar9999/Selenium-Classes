package PracticeClasses;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v106.network.Network;
import org.openqa.selenium.devtools.v106.network.model.Headers;

import io.netty.handler.codec.base64.Base64;

public class AuthHandle {
	
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
		
		//send auth header:
		Map<String, Object> headers = new HashMap<>();
//		String basicAuth = "Basic" + new String (new Base64().encode(String.format("%S:%S", username,  password)));
//		headers.put("Authorization", basicAuth);
		
		devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));
		
		driver.get("http://the-internet.herokuapp.com/basic_auth");
	}

}
