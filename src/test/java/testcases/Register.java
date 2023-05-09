package testcases;

import static org.testng.Assert.assertTrue;
import java.util.Random;
import org.testng.annotations.Test;


public class Register extends BaseTest {
	
	@Test
	public void signUp() {
		homePage.clickSignUp();
		memLoginPage.notAMemberSignUp();
		
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		String randEmail = "username"+ randomInt +"@gmail.com"; 
		
		registerPage.enterEmailId(randEmail);
		registerPage.enterPassword("1234");
		registerPage.enterConfirmPassword("1234");
		registerPage.enterName("testUser");
		registerPage.enterAddress("address");
		registerPage.enterCity("city");
		registerPage.sigupButton();
		assertTrue(registerPage.verifyElementPresent());
		
	}

}
