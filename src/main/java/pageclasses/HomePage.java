package pageclasses;

import org.openqa.selenium.By;

import drivermanager.WebDriverManager;

public class HomePage {

	WebDriverManager webDriverManager;

	private static final By SIGNIN_LINK_LOCATOR = By.xpath("//a[contains(text(),'Sign in')]");

	public HomePage(WebDriverManager webDriverManager) {
		this.webDriverManager = webDriverManager;
	}

	public void gotoLoginPage() {
		webDriverManager.log("clicking on signinLink.");
		webDriverManager.clickOn(SIGNIN_LINK_LOCATOR);
	}

	public void loadWebSite_inBrowser(String bName) {
		webDriverManager.log("Opening browser ");
		webDriverManager.openBrowser(bName);
		webDriverManager.log("Launching the website :");
		webDriverManager.navigate("URL");

	}

}
