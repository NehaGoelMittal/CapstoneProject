package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PaymentGatewayPage extends BasePage{
	
	By flightConfirm = By.xpath("//h3[text()=' FLYAWAY - PAYMENT GATEWAY ']");
	By completeBooking = By.linkText("Click to complete booking");
	
	public PaymentGatewayPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}

	
	public boolean verifyPaymentGateway() {
		System.out.println("---"+getText(flightConfirm));
		return isTextPresent("FLYAWAY - PAYMENT GATEWAY", getText(flightConfirm));
	}
	
	public void completeBooking() {
		clickElement(completeBooking);
	}
	
}


