package stepdef;

import org.testng.Assert;
import context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.LoginPage;

public class LoginSteps {
	
	public TestContext context;
	LoginPage loginPage;
	
	public LoginSteps(TestContext context) {
		this.context=context;
		this.loginPage=this.context.getPageClassManager().getLoginPage();
	 }
    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password() {
    	context.log("I enter a valid username and password");
    	loginPage.enterValidCredentials("bloggerdelhi123@gmail.com","Password");
    }
    @When("I enter a Invalid username and password")
    public void i_enter_a_Invalid_username_and_password() {
    	context.log("I enter a Invalid username and password");
    	loginPage.enterValidCredentials("abcd@rediffmail.com","Password");
    }
    @When("I click on the login button")
    public void i_click_on_the_login_button() {
    	context.log("I click on the login button");
    	loginPage.submitCred();
    }
    @Then("I should not be allowed to log in and warning message should appear")
    public void Then_I_should_not_be_allowed_to_log_in_and_warning_message_should_appear() {
        context.log("User is not able to login due to incorrect credentials");
        String actualMessage = loginPage.getAuthFailMessage();
        String expectedMessage = "Authentication failed.";
        Assert.assertEquals(actualMessage, expectedMessage, "Authentication failure message mismatch!");
        context.log("Warning message verified successfully: " + actualMessage);
    }
    @And("I enter username {string} and password {string}")
	public void I_enter_username_and_password(String emailid, String password) {
    	context.log("I enter a below credentials for parametrized testing.");
    	loginPage.enterValidCredentials(emailid,password);	
	}
}