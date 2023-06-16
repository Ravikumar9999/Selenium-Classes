package WebDriverArchitecture;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		System.out.println("launch chrome browser");
	}

	@Override
	public void get(String url) {
		System.out.println("launch url " + url);
		
		
	}

	@Override
	public void findElement(String locator) {
		System.out.println("finding the element " + locator);
		
	}

	
	@Override
	public void clickButton(String element) {
		System.out.println("clicks on login button " + element);
		
	}
	
	@Override
	public void close() {
		System.out.println("close the browser");
		
	}

	@Override
	public void quit() {
		System.out.println("quit all the browsers");
		
	}

	

	
	

}
