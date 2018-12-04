package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TwentyListPropertiesPage extends CommonsFunction {

	WebDriver driver;

	public TwentyListPropertiesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void verifyListPropertiesDisplayed(WebDriver driver, String locator) {
		List<WebElement> listProperty = driver.findElements(By.xpath(locator));
		Assert.assertTrue(listProperty.size() > 0);
	}
}
