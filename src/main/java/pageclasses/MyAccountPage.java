package pageclasses;

import java.time.Duration;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivermanager.WebDriverManager;

public class MyAccountPage {

	WebDriverManager webDriverManager;

	private static final By LOGGEDIN_USER_TEXT = By.xpath("//a[@title='View my customer account']");
	private static final By ADD_NEW_ADDRESS_LINK_LOCATOR = By.xpath("//a[@title='Add my first address']");
	private static final By SEARCH_TEXTBOX_LOCATOR = By.id("search_query_top");

	public MyAccountPage(WebDriverManager webDriverManager) {
		this.webDriverManager = webDriverManager;
	}

	public String getLoggedin_UserText() {
		return webDriverManager.getText(LOGGEDIN_USER_TEXT);
	}

	/*public AddressPage gotoAddAddressPage() {
		click(ADD_NEW_ADDRESS_LINK_LOCATOR);
		return new AddressPage();
	}*/

	/*public SearchResultPage searchforProduct(String productName) {

		enterText(SEARCH_TEXTBOX_LOCATOR, productName);
		enterSpecialKey(SEARCH_TEXTBOX_LOCATOR, Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@itemprop='name']/a")));
		SearchResultPage searchResulstPage = new SearchResultPage(getDriver());
		return searchResulstPage;
	}*/
}