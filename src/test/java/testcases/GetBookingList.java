package testcases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetBookingList extends BaseTest {

	@Test
	public void getBookingsList() {

		login();
		memLoginPage.clickYourBookings();

//		RestAssured.baseURI = "http://localhost:8080/FlyAway";
//		RestAssured.given().log().all().accept(ContentType.JSON).when().get("/memberbookings").then().statusCode(200)
//				.log().all();
		
//		// Specify the base URL to the RESTful web service 
//		RestAssured.baseURI = "http://localhost:8080/FlyAway/memberbookings"; 
//		// Get the RequestSpecification of the request to be sent to the server. 
//		RequestSpecification httpRequest = RestAssured.given(); 
//		// specify the method type (GET) and the parameters if any. 
//		//In this case the request does not take any parameters 
//		Response response = httpRequest.request(Method.GET, "");
//		// Print the status and message body of the response received from the server 
//		System.out.println("Status received => " + response.getStatusLine()); 
//		System.out.println("Response=>" + response.prettyPrint());
		
        // Make GET request to URL and get response
        Response response = RestAssured.get("http://localhost:8443/FlyAway/memberbookings");
        
        // Get response body as a string
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);

	}
	
}
