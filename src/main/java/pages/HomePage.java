package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	By SignUp = By.linkText("Login/Signup");
	By selectSource = By.name("source");
	By selectDestination = By.name("destination");
	By submitButton = By.xpath("//button[text()='Submit']");
	By bookFlight = By.linkText("Book Flight");

	public HomePage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}
	
	public void clickSignUp() {
		clickElement(SignUp);
	}	
	
	public void selectSourceLocation(String srcLoc) {
		
		selectText(selectSource, srcLoc);		
	}
	
	public void selectDestinationLocation(String desLoc) {
		
		selectText(selectDestination, desLoc);		
	}
	
	public void clickSubmitButton() {
		clickElement(submitButton);
	}
	
	public void clickBookFlight() {
		clickElement(bookFlight);
	}
}
