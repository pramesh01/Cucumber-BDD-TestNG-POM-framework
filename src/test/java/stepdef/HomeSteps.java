package stepdef;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageclasses.HomePage;
import pageclasses.LoginPage;
import utils.TakeScreenshot;

public class HomeSteps {

	public TestContext context;
	public HomePage homePage;
	public LoginPage loginPage;

	public HomeSteps(TestContext context) {
		this.context = context;
		this.homePage = this.context.getPageClassManager().getHomePage();

	}

	@Before
	public void before(Scenario scenario) {
		context.createScenario(scenario.getName());
		context.log("before Scenario:  " + scenario.getName());
	}

	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			String path = TakeScreenshot.takeScreenshot(context.getPageClassManager().getWebDriverManager().getDriver(),
					scenario.getName());
			context.logFailure("This test step is failed..", path);
		}
	}

	@After
	public void after(Scenario scenario) {
		// context.log("after Scenario: " + scenario.getName());
		if (scenario.isFailed()) {
			context.log("Scenario FAILED: " + scenario.getName());
		} else {
			context.log("Scenario PASSED: " + scenario.getName());
		}

		// Close browser
		context.getPageClassManager().getWebDriverManager().quitDriver();

		// End reporting

		context.endScenario();
		System.out.println("-----------------------------------------------------");

	}

	@Given("I open the application")
	public void i_open_the_application() {
		context.log("I open the application");
		homePage.loadWebSite_inBrowser("chrome");

	}

	@When("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		context.log("I navigate to the login page");
		homePage.gotoLoginPage();

	}

}
