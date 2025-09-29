package pageclasses;

import org.openqa.selenium.By;

import drivermanager.WebDriverManager;

public class LoginPage {

	WebDriverManager webDriverManager;

	private static final By EMAIL_LINK_LOCATOR = By.id("email");
	private static final By PASSWORD_LINK_LOCATOR = By.id("passwd");
	private static final By SIGNIN_SUBMIT_LOCATOR = By.id("SubmitLogin");
	static final By INVALID_AUTHENTICATION_MESSAGE = By.xpath("//*[text()='Authentication failed.']");

	public LoginPage(WebDriverManager webDriverManager) {
		this.webDriverManager = webDriverManager;
	}

	public void enterValidCredentials(String userEmail, String password) {
		webDriverManager.type(EMAIL_LINK_LOCATOR, userEmail);
		webDriverManager.type(PASSWORD_LINK_LOCATOR, password);
	}

	public void submitCred() {
		webDriverManager.clickOn(SIGNIN_SUBMIT_LOCATOR);
	}

	public String getAuthFailMessage() {
		return webDriverManager.getText(INVALID_AUTHENTICATION_MESSAGE);
	}
}
