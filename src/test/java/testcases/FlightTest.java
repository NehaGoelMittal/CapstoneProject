package testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class FlightTest extends BaseTest{
	

	
	@Test
	public void bookFlight() throws InterruptedException {
		login();
		homePage.selectDestinationLocation("Bangalore");
		homePage.selectDestinationLocation("Hyderabad");
		homePage.clickSubmitButton();
		homePage.clickBookFlight();
		paymentGatewayPage.verifyPaymentGateway();
		paymentGatewayPage.completeBooking();
		bookingsConfirmation.getBookingConfirmationText();
		assertTrue(bookingsListPage.verifyLandedOnBookingListPage());
	}
		

}
