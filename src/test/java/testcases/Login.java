package testcases;

import static org.testng.Assert.assertTrue;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class Login extends BaseTest {

	@Test
	public void loginTest() throws SQLException, InterruptedException {

		homePage.clickSignUp();

		ResultSet rs = st.executeQuery("select * from f_user where name='Neha Mittal'");

		while (rs.next()) {
			System.out.println(rs.getString("email"));
			registerPage.enterEmailId(rs.getString("email"));
			registerPage.enterPassword(rs.getString("pwd"));
		}

		memLoginPage.memberLogin();
		assertTrue(memLoginPage.verifyTextPresent());
	}

}
