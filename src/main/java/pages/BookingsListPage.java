package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BookingsListPage extends BasePage{
	
	By bookingsListPage = By.xpath("//h3[text()= 'FLYAWAY - YOUR BOOKINGS'] ");
	
	public BookingsListPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);
	}

	public boolean verifyLandedOnBookingListPage() {
		return isElementPresent(bookingsListPage);	
	}

}
