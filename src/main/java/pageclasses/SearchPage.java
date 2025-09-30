package pageclasses;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import drivermanager.WebDriverManager;

public class SearchPage {

	WebDriverManager webDriverManager;

	private static final By SEARCH_TEXTBOX_LOCATOR = By.id("search_query_top");
	private static final By PRODUCT_ITEM_LOCATOR = By.xpath("//span[@class='lighter']");
	public static final By ALL_SEARCHED_ITEMLIST_NAMES = By.xpath("//h5[@itemprop='name']/a");

	public SearchPage(WebDriverManager webDriverManager) {
		this.webDriverManager = webDriverManager;
	}

	public void enterProductName(String product) {
		webDriverManager.type(SEARCH_TEXTBOX_LOCATOR, product);

	}

	// Click the search button
	public void clickSearchButton() {
		webDriverManager.type(SEARCH_TEXTBOX_LOCATOR, Keys.ENTER);
	}

	// Check if the expected product is displayed in the search results
	public boolean isProductInResults(String product) {

		List<String> keywords = Arrays.asList(product.toLowerCase().split(" "));
		List<String> productNameList = webDriverManager.getALLVisibleText(ALL_SEARCHED_ITEMLIST_NAMES);
		if (productNameList.isEmpty()) {
			return false;
		}
		boolean result = productNameList.stream()
				.anyMatch(name -> keywords.stream().anyMatch(name.toLowerCase()::contains));

		if (!result) {

		}
		return result;
	}

	// Check if "no products found" message is displayed
	public boolean isNoResultsMessageDisplayed() {
		try {
			return webDriverManager.getVisibleText(By.xpath("//*[contains(text(),'0 results have been found')]"))
					.contains("0 results");
		} catch (Exception e) {
			return false;
		}
	}
}
