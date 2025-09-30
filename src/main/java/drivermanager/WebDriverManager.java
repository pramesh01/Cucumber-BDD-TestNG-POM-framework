package drivermanager;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class WebDriverManager {

	WebDriver driver;
	ExtentTest test;
	Properties prop;
	SoftAssert softAsert;

	public WebDriverManager() {
		prop = new Properties();
		String filePath = System.getProperty("user.dir") + "//src//main//resources//project.properties";

		try {
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println(prop.getProperty("URL"));
		softAsert = new SoftAssert();

	}

	public void init(ExtentTest test) {
		this.test = test;
	}

	public String getProperty(String key) {
		return prop.getProperty(key);
	}

	public void openBrowser(String browserName) {
		test.log(Status.INFO, "launching the browser : " + browserName);
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void navigate(String urlKey) {
		test.log(Status.INFO, "navigating towards website " + getProperty(urlKey));
		driver.get(getProperty(urlKey));
	}

	public void clickOn(By Locator) { // ony for xpath so far
		test.log(Status.INFO, "clicking on element ");
		driver.findElement(Locator).click();
	}

	public void type(By locator, String textData) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		test.log(Status.INFO, "typing text " + textData + " in text area..");
		driver.findElement(locator).sendKeys(textData);
	}

	public void type(By locator, CharSequence keys) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		test.log(Status.INFO, "sending keys " + keys + " to element..");
		driver.findElement(locator).sendKeys(keys);
	}

	public void log(String msg) {
		test.log(Status.INFO, msg);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public String getText(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		test.log(Status.INFO, "Getting text from element: " + locator.toString());
		return element.getText();
	}

	public String fetchAuthMessage(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		String message = element.getText().trim();
		return message;
	}

	public void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public List<String> getALLVisibleText(By locator) {
		List<WebElement> allWebElement = driver.findElements(locator);
		List<String> visibleTextList = new ArrayList<>();
		for (WebElement element : allWebElement) {
			String text = getVisibleText(element);
			visibleTextList.add(getVisibleText(element));
		}
		return visibleTextList;
	}

	public String getVisibleText(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		test.log(Status.INFO, "Fetched visible text: <b>" + webElement.getText() + "</b>");
		return webElement.getText();
	}

	public String getVisibleText(WebElement element) {
		String text = element.getText().trim();
		test.log(Status.INFO, "Visible text from element: [" + element + "] => " + text);
		// Log to Extent Report
		test.log(Status.INFO, "Fetched visible text: <b>" + text + "</b>");
		// return element.getText();
		return text;
	}

	public void selectFromDropDown(By dropdownLocator, String TextToBeSelected) {
		// test.log(Status.INFO," selecting from drop down " + dropdownLocator);
		test.log(Status.INFO, "Selecting from drop down: " + dropdownLocator + " -> " + TextToBeSelected);
		WebElement element = driver.findElement(dropdownLocator);
		test.log(Status.INFO, "drop down item found and selected.. " + dropdownLocator);
		Select select = new Select(element);
		select.selectByVisibleText(TextToBeSelected);
		test.log(Status.INFO, "Drop down value selected: " + TextToBeSelected);

	}

}
