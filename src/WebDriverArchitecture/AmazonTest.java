package WebDriverArchitecture;

public class AmazonTest {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.findElement("name");
		driver.clickButton("Login");
		driver.close();
		driver.quit();

	}

}
