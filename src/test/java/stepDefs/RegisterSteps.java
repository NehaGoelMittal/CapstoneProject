package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testcases.BaseTest;

public class RegisterSteps extends BaseTest {

	
	@Given("Launch flyaway airline website.")
	public void launch_flyaway_airline_website() {
		
		System.out.println("Flyaway airlines is launched");
	}

	@When("User click on SignUp button")
	public void user_click_on_sign_up_button() {

		homePage.clickSignUp();

	}

	@When("Click on Not a member? Signup")
	public void click_on_not_a_member_signup() {
		memLoginPage.notAMemberSignUp();
	}

	@When("Enter email id")
	public void enter_email_id() {
		registerPage.enterEmailId("abc@test.com");
	}

	@When("Enter password and confirm password")
	public void enter_password_and_confirm_password() {

		registerPage.enterPassword("12345");
		registerPage.enterConfirmPassword("12345");
	}

	@When("Enter name, address and city")
	public void enter_name_address_and_city() {

		registerPage.enterName("testUser1");
		registerPage.enterAddress("testAdd");
		registerPage.enterCity("city");
	}

	@Then("Click on SignUp button")
	public void click_on_sign_up_button() {
				registerPage.sigupButton();
	}

	@Then("Verify new user is created")
	public void verify_new_user_is_created() {
		System.out.println("user created");
	}

}
