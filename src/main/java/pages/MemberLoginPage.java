package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MemberLoginPage extends BasePage {
	
	By MemberSignUp = By.linkText("Not a member? Signup");
	By loginButton = By.xpath("//button[text()='Login']");
	By ExpectedText = By.xpath("//h3[text()=' FLYAWAY - DASHBOARD ']");
	By homeLink = By.linkText("Home");
	By yourBookings = By.linkText("Your Bookings");

	public MemberLoginPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void notAMemberSignUp() {
		clickElement(MemberSignUp);
	}
	
	public void memberLogin() {
		clickElement(loginButton);
	}
	
	public boolean verifyTextPresent() {
		System.out.println("---"+getText(ExpectedText));
		return isTextPresent("FLYAWAY - DASHBOARD", getText(ExpectedText));
	}
	
	public void clickHomeLink() {
		clickElement(homeLink);
	}
	
	public void clickYourBookings() {
		clickElement(yourBookings);
	}
}
