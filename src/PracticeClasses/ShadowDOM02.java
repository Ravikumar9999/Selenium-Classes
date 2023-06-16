package PracticeClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ShadowDOM02 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://shop.polymer-project.org/detail/mens_outerwear/Anvil+L+S+Crew+Neck+-+Grey");
		
		Thread.sleep(4000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement addToCart = (WebElement) jse.executeScript("return document.querySelector(\"body > shop-app\").shadowRoot.querySelector(\"iron-pages > shop-detail\").shadowRoot.querySelector(\"#content > div > shop-button > button\")");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", addToCart);
		
		WebElement viewCart = (WebElement) jse.executeScript("return document.querySelector(\"body > shop-app\").shadowRoot.querySelector(\"shop-cart-modal\").shadowRoot.querySelector(\"#viewCartAnchor\")");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", viewCart);
		
		WebElement checkout = (WebElement) jse.executeScript("return document.querySelector(\"body > shop-app\").shadowRoot.querySelector(\"iron-pages > shop-cart\").shadowRoot.querySelector(\"div > div:nth-child(2) > div.checkout-box > shop-button > a\")");
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", checkout);
		
		
//		WebElement emailValue = (WebElement) jse.executeScript("return document.querySelector(\"body > shop-app\").shadowRoot.querySelector(\"iron-pages > shop-checkout\").shadowRoot.querySelector(\"#accountEmail\")");
//		
//		String js = "arguments[0].setAttribute('value', 'Ravi Kumar')";
//		
//		((JavascriptExecutor)driver).executeScript(js, emailValue);

	}

}
