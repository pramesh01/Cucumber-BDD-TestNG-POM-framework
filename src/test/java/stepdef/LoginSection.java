package stepdef;

import context.TestContext;
import io.cucumber.java.en.When;

public class LoginSection {
	
	public TestContext context;
	
	public LoginSection(TestContext context) {
		//context.log("..inside Login Section constructor...");
		this.context=context;
	 }
	
    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password() {
    	context.log("I enter a valid username and password");
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
    	context.log("I click on the login button");
    }

}
