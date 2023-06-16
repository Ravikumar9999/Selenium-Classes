package PracticeClasses;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowPopupHandle {

	public static void main(String[] args) throws InterruptedException {

		// Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.findElement(By.id("newWindowBtn")).click();

		Thread.sleep(2000);

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("parent window id:" + parentWindowId);

		String childWindowId = it.next();
		System.out.println("child window id:" + childWindowId);

		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("child window pop up title " + driver.getTitle());

		driver.close();

		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		System.out.println("parent window title " + driver.getTitle());

	}

}
