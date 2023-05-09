package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	protected ThreadLocal<WebDriver> driver2 = new ThreadLocal();

    public BasePage(ThreadLocal<WebDriver> driver) {
        this.driver2 = driver;
    }

	public void webDriverWait(By element, int time) {
		// driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver2.get(), Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}

	protected void clickElement(By element) {
		driver2.get().findElement(element).click();
	}

	protected void setText(By element, String textToType) {
		driver2.get().findElement(element).sendKeys(textToType);
	}

	protected String getText(By element) {
		return driver2.get().findElement(element).getText();
	}

	protected boolean isElementPresent(By element) {
		return driver2.get().findElement(element).isDisplayed();
	}

	protected boolean isTextPresent(String actualText, String textToVerify) {

		return actualText.contains(textToVerify);
	}

	protected ArrayList<String> getAllTextsByElement(By element) {
		int count = 0;
		ArrayList<String> results = new ArrayList<String>();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		List<WebElement> webElements = driver2.get().findElements(element);

		for (WebElement item : webElements) {

			results.add(item.getText());
			count++;
		}
		System.out.println("Total number of elements visible: " + count);
		System.out.println(results);
		return results;
	}

	protected String getCurrentPageUrl() {
		return driver2.get().getCurrentUrl();
	}

	protected String getCurrentPageTitle() {
		return driver2.get().getTitle();
		
	}
	
	protected void selectText(By element, String text) {
		WebElement we = driver2.get().findElement(element);
		Select se1 = new Select (we);	
		se1.selectByVisibleText(text);
	}

}
