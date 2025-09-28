package stepdef;

import context.TestContext;
import io.cucumber.java.en.Then;

public class ValidateLogin {
	
public TestContext context;
	
	public ValidateLogin(TestContext context) {
		//context.log("..inside ValidateLogin constructor...");
		this.context=context;
	 }
	
	@Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
		context.log("I should be logged in successfully");  
    }
	
    @Then("I should see my account page")
    public void i_should_see_my_account_page() {
    	context.log("I should be logged in successfully");
    }
     }
