
package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testcases.BaseTest;

public class Hooks extends BaseTest {

	@Before()
	public void setUp(Scenario scenario) {

		LsetUp();

	}

	@After()
	public void tearDown() {

		cleanUpActivities();
	}

}
