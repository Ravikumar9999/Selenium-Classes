package PracticeClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SVGGraphHandle {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://emicalculator.net");
		//Thread.sleep(5000);
		
		
		String verticalXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series-group']//*[name()='rect']";
		
		String verticalTextXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";		
		
		List<WebElement> barsList = driver.findElements(By.xpath(verticalXpath));
		System.out.println("Total No of Bars: " + barsList.size());
				
		Actions action = new Actions(driver);
		for(WebElement e: barsList ) {
			action.moveToElement(e).perform();
			//Thread.sleep(500);
			String verticalText = driver.findElement(By.xpath(verticalTextXpath)).getText();
			System.out.println(verticalText);
			
		}
		
		String circleXpath = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-series highcharts-series-0 highcharts-pie-series highcharts-tracker']//*[name()='path']";

		String circleTextXpath = "//*[local-name()='svg']//*[name()='g' and @style='white-space:nowrap;font:14px Lato, Helvetica Neue, Helvetica, Arial, sans-serif;pointer-events:none;']//*[name()='text']";
				
		List<WebElement>  circleList = driver.findElements(By.xpath(circleXpath));
		System.out.println("Total No of Charts : " + circleList.size());
				
		Actions action1 = new Actions(driver);
		for(WebElement c: circleList ) {
			action1.moveToElement(c).perform();
			String circleText = driver.findElement(By.xpath(circleTextXpath)).getText();
			System.out.println(circleText);
			
		
		}
		
		
	}

}
