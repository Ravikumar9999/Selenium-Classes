package WebDriverArchitecture;

public interface WebDriver {
	
	public void get(String url);
	
	public void findElement(String locator);
	
	public void clickButton(String element);
	
	public void close();
	
	public void quit();

}
