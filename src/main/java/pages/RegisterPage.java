package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {
	
	By emailId = By.name("email_id");
	By password = By.name("pwd");
	By confirmPassword = By.name("pwd2");
	By name = By.name("name");
	By address = By.name("address");
	By city = By.name("city");
	By com = By.xpath("//button[text()='Signup']");
	By verifyLink = By.xpath("//a[contains(text(),'continue checking flights')]");
	By signUpButton = By.xpath("//button[text()='Signup']");
	

	public RegisterPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}
	
	
	public void enterEmailId(String email) {
		setText(emailId, email);
	}
	
	public void enterPassword(String pwd) {
		setText(password, pwd);
	}
	
	public void enterConfirmPassword(String confirmPwd) {
		setText(confirmPassword, confirmPwd);
	}
	public void enterName(String userName) {
		setText(name, userName);
	}
	public void enterAddress(String userAdd) {
		setText(address, userAdd);
	}
	public void enterCity(String userCity) {
		setText(city, userCity);
	}
	
	public void sigupButton() {
		clickElement(signUpButton);
	}
	
	public boolean verifyElementPresent() {
		
		webDriverWait(verifyLink, 5);	
		System.out.println("---"+getText(verifyLink));
		return isElementPresent(verifyLink);
	}

}
