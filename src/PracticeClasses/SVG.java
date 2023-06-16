package PracticeClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SVG {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("file:///C:/Users/RAVI%20KUMAR/Desktop/index.htm");
		// https://flaviocopes.com/svg/
		
		//*[name()='svg']//*[local-name()='rect' and @width='400']
		String color = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='circle']")).getAttribute("fill");
		System.out.println(color);
		
		String color1 = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='rect']")).getAttribute("fill");
		System.out.println(color1);
		
		String text = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='text' and @x='5']")).getText();
		System.out.println(text);
		
		//*[name()='svg']//*[local-name()='path' and @fill='blue']
		String color2 = driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='path' and @fill='blue']")).getAttribute("stroke");
		System.out.println(color2);

	
	}

}
