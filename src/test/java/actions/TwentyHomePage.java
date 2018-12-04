package actions;

import org.openqa.selenium.WebDriver;

public class TwentyHomePage extends CommonsFunction {

	WebDriver driver;

	public TwentyHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void inputTextToSearch(String locator, String searchText) {
		sendkeyToElement(driver, locator, searchText);
	}

	public void clickToSearchButton(String locator) {
		clickToElement(driver, locator);
	}
}
