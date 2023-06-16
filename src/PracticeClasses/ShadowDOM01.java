package PracticeClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDOM01 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://watir.com/examples/shadow_dom.html");
		
		Thread.sleep(4000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
        WebElement emailValue = (WebElement) jse.executeScript("return document.querySelector(\"#shadow_host\").shadowRoot.querySelector(\"input[type=text]:nth-child(4)\")");
		
		String js = "arguments[0].setAttribute('value', 'Ravi Kumar')";
		
		jse.executeScript(js, emailValue);

	}

}
