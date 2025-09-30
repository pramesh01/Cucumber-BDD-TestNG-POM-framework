package stepdef;

import org.testng.Assert;

import context.TestContext;
import io.cucumber.java.en.Then;
import pageclasses.MyAccountPage;

public class ValidateSteps {

	public TestContext context;
	MyAccountPage myAccountPage;

	public ValidateSteps(TestContext context) {
		this.context = context;
		this.myAccountPage = this.context.getPageClassManager().getMyAccountPage();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		context.log("I should be logged in successfully");
		String actualUserText = myAccountPage.getLoggedin_UserText();
		String expectedUserText = "Parthik Verma"; // put your expected username here
		Assert.assertEquals(actualUserText, expectedUserText, "User login verification failed!");
	}
	

}
