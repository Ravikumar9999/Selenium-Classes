package PracticeClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
//	@BeforeSuite -- setup system property for chrome -- 1
//	@BeforeTest -- launch chrome browser -- 2
//	@BeforeClass -- login to app -- 3
	
//	@BeforeMethod -- enter URL -- 4
//	@Test -- Google logo Test
//	@AfterMethod -- logout from app
	
//	@BeforeMethod -- enter URL -- 5
//	@Test -- title Test
//	@AfterMethod -- logout from app
	
//	@BeforeMethod -- enter URL -- 6
//	@Test -- search Test
//	@AfterMethod -- logout from app
	
//	@AfterClass -- Close Browser -- 7
//	@AfterTest -- deleteAllCookies -- 8
		
	
	
	//Pre-conditions annotations -- starting with @Before
	@BeforeSuite //1
	public void setUp() {
		System.out.println("@BeforeSuite -- setup system property for chrome");
	}
	
	
	@BeforeTest //2
	public void launchBrowser() {
		System.out.println("@BeforeTest -- launch chrome browser");
	}
	
	
	
	@BeforeClass //3
	public void login() {
		System.out.println("@BeforeClass -- login to app");
	}
	
	
	//@BeforeMethod --enter URL
	//@Test - 1     --Google title Test
	//@AfterMethod  --logout from app
	//
	//@BeforeMethod --enter URL
	//@Test - 2     --search Test
	//@AfterMethod  --logout from app
	//
	//@BeforeMethod --enter URL
	//@Test - 2     --Google logo Test
	//@AfterMethod  --logout from app
	
	@BeforeMethod //4
	public void enterURL() {
		System.out.println("@BeforeMethod -- enter URL");	
	}
	
	
	//Test case -- starting with @Test
	@Test //5
	public void googleTitleTest() {
		System.out.println("@Test -- title Test");
	}
	
	
	
	@Test
	public void searchTest() {
		System.out.println("@Test -- search Test");
	}
	
	
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test -- Google logo Test");
	}
	
	
	//Post-conditions annotations -- starting with @After
	@AfterMethod //6
	public void logOut() {
		System.out.println("@AfterMethod -- logout from app");
	}
	
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("@AfterClass -- Close Browser");
	}
	
	
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("@AfterTest -- deleteAllCookies");
	}
	
	
	
	
	
	
	

	
	
}
