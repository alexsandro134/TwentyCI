package testcases;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import actions.TwentyHomePage;
import actions.TwentyListPropertiesPage;
import actions.TwentyPropertySearchPage;

public class RightMove_01 {
	WebDriver driver;

	String rightmoveUrl = "https://www.rightmove.co.uk/";
	String location = "Milton Keynes";
	String minListPrice = "No min";
	String maxListPrice = "300,000";
	String minNumberOfBedRooms = "2";
	String maxNumberOfBedRooms = "3";

	String inputSearchTextXpath = "//input[@id='searchLocation']";
	String buttonSearchXpath = "//button[@id='buy']";
	String minPriceXpath = "//select[@id='minPrice']";
	String maxPriceXpath = "//select[@id='maxPrice']";
	String minNumberBedroomsXpath = "//select[@id='minBedrooms']";
	String maxNumberBedroomsXpath = "//select[@id='maxBedrooms']";
	String searchButtonXpath = "//button[@id='submit']";

	String listPropertiesXpath = "//div[contains(@id,'property-')]";

	private TwentyHomePage homePage;
	private TwentyPropertySearchPage searchPage;
	private TwentyListPropertiesPage listPage;

	@BeforeClass
	public void beforeTest() {
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		driver.get(rightmoveUrl);
		driver.manage().window().maximize();
	}

	@Test
	public void TC_01() {
		homePage = new TwentyHomePage(driver);
		homePage.inputTextToSearch(inputSearchTextXpath, location);
		homePage.clickToSearchButton(buttonSearchXpath);

		searchPage = new TwentyPropertySearchPage(driver);
		searchPage.selectValueToSearch(driver, minPriceXpath, minListPrice);
		searchPage.selectValueToSearch(driver, maxPriceXpath, maxListPrice);
		searchPage.selectValueToSearch(driver, minNumberBedroomsXpath, minNumberOfBedRooms);
		searchPage.selectValueToSearch(driver, maxNumberBedroomsXpath, maxNumberOfBedRooms);
		searchPage.clickSearchButton(driver, searchButtonXpath);

		listPage = new TwentyListPropertiesPage(driver);
		listPage.verifyListPropertiesDisplayed(driver, listPropertiesXpath);
	}

	@AfterClass
	public void afterTest() {
		driver.quit();
	}
}
