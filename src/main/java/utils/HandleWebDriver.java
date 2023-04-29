package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleWebDriver {

	public ThreadLocal<WebDriver> getDriver(ThreadLocal<WebDriver> driver) {

			ChromeOptions ops = new ChromeOptions();
			ops.addArguments("--remote-allow-origins=*");
			driver.set(new ChromeDriver(ops));

		return driver;
	}
}
