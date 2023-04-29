package testcases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.BasePage;
import pages.BookingsConfirmationPage;
import pages.BookingsListPage;
import pages.HomePage;
import pages.MemberLoginPage;
import pages.PaymentGatewayPage;
import pages.RegisterPage;
import utils.HandleWebDriver;

public class BaseTest {

	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	protected static HomePage homePage;
	protected static MemberLoginPage memLoginPage;
	protected static RegisterPage registerPage;
	protected static PaymentGatewayPage paymentGatewayPage;
	protected static BookingsListPage bookingsListPage;	
	protected static BookingsConfirmationPage bookingsConfirmation;
	Connection ct = null;
	Statement st;
	
	
//	jdbc.driverClassName=com.mysql.jdbc.Driver
//			jdbc.dialect=org.hibernate.dialect.MySQLDialect
//			jdbc.databaseurl=jdbc:mysql://127.0.0.1:3306/flyaway
//			jdbc.username=root
//			jdbc.password=
//location: C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\FlyAway\WEB-INF
	
	@BeforeClass
	public void connectionsetUp() throws SQLException, ClassNotFoundException, InterruptedException {
		Class.forName("com.mysql.jdbc.Driver");
		ct = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/FlyAway", "root", "");
		st = ct.createStatement();
	}

	@BeforeMethod(alwaysRun = true)
	protected void setUp() {

		HandleWebDriver handleWebDriver = new HandleWebDriver();
		driver = handleWebDriver.getDriver(driver);

		launchBrowser();
		initializePageObjects();
	}

	public void launchBrowser() {
		driver.get().manage().window().maximize();
		driver.get().manage().deleteAllCookies();
		driver.get().get("http://localhost:8080/FlyAway/");
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	public void initializePageObjects() {

		homePage = new HomePage(driver);
		memLoginPage = new MemberLoginPage(driver);
		registerPage = new RegisterPage(driver);
		paymentGatewayPage = new PaymentGatewayPage(driver);
		bookingsListPage = new BookingsListPage(driver);
		bookingsConfirmation= new BookingsConfirmationPage(driver);
	}
	
	public void login() {

		homePage.clickSignUp();
		registerPage.enterEmailId("def@gf.com");
		registerPage.enterPassword("1234");
		memLoginPage.memberLogin();
		memLoginPage.clickHomeLink();
	}


}
