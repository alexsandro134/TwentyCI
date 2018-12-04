package actions;

import org.openqa.selenium.WebDriver;

public class TwentyPropertySearchPage extends CommonsFunction {

	WebDriver driver;

	public TwentyPropertySearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public void selectValueToSearch(WebDriver driver, String locator, String text) {
		selectElementByText(driver, locator, text);
	}
	
	public void clickSearchButton(WebDriver driver, String locator) {
		clickToElement(driver, locator);
	}
}
