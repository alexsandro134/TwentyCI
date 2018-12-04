package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonsFunction {

	public void clickToElement(WebDriver driver, String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	public void sendkeyToElement(WebDriver driver, String locator, String text) {
		driver.findElement(By.xpath(locator)).sendKeys(text);
	}

	public void selectElementByText(WebDriver driver, String locator, String text) {
		Select minPrice = new Select(driver.findElement(By.xpath(locator)));
		minPrice.selectByVisibleText(text);
	}

	public List<WebElement> findListElements(WebDriver driver, String locator) {
		List<WebElement> listElements = driver.findElements(By.xpath(locator));
		return listElements;
	}
}
