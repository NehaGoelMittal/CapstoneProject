package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BookingsConfirmationPage extends BasePage {
	
	By confirmedBooking = By.linkText("See Your Bookings");
	
	public BookingsConfirmationPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}

	public void getBookingConfirmationText() {
		System.out.println(getText(confirmedBooking));
		clickElement(confirmedBooking);
	}

}
