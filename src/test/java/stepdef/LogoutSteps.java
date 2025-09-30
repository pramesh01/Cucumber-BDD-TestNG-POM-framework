package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageclasses.MyAccountPage;

public class LogoutSteps {
	
	private TestContext context;
    private MyAccountPage myAccountPage;

    public LogoutSteps(TestContext context) {
        this.context = context;
        this.myAccountPage = this.context.getPageClassManager().getMyAccountPage();
    }
    
    @When("I click on the logout button")
    public void i_click_on_the_logout_button() {
    	myAccountPage.clickLogout(); // method to click logout
    }

    @Then("I should be logout successfully and redirected to the login page")
    public void i_should_be_logout_successfully_and_redirected_to_the_login_page() {
        
        
    }

}
