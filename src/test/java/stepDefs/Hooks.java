
package stepDefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.HomePage;
import pages.MemberLoginPage;
import pages.RegisterPage;
import testcases.BaseTest;
import utils.HandleWebDriver;

public class Hooks extends BaseTest {
	
	

//	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

//	public static HomePage homePage = new HomePage(driver);
//	public static MemberLoginPage memLoginPage = new MemberLoginPage(driver);
//	public static RegisterPage registerPage = new RegisterPage(driver);

//	protected static HomePage homePage;
//	protected static MemberLoginPage memLoginPage;
//	protected static RegisterPage registerPage;

	@Before()
	protected void setUp(Scenario scenario) {

		// Run using RemoteWebDriver
//		HandleWebDriver handleWebDriver = new HandleWebDriver();
//		driver = handleWebDriver.getDriver(driver);
//
//		initializePageObjects();
//
//		launchBrowser();

		 setUp();

	}

//	public void launchBrowser() {
//		driver.get().manage().window().maximize();
//		driver.get().manage().deleteAllCookies();
//		driver.get().get("http://localhost:8080/FlyAway/");
//		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//
//	}
//
//	public void initializePageObjects() {
//
//		homePage = new HomePage(driver);
//		memLoginPage = new MemberLoginPage(driver);
//		registerPage = new RegisterPage(driver);
//	}

	@After()
	public void tearDown(Scenario scenario) {

	//	driver.get().quit();
	//	cleanUpActivities();
	}

}
