package bookingList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import testcases.BaseTest;

public class FetchBookingList extends BaseTest {

	@Test
	public void getBookingsList() {

		login();
		memLoginPage.clickYourBookings();

		RestAssured.baseURI = "http://localhost:8080/FlyAway";
		RestAssured.given().log().all().accept(ContentType.JSON).when().get("/memberbookings").then().statusCode(200)
				.log().all();

	}

}