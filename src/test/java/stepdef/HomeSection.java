package stepdef;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSection {
	
public TestContext context;
	
	public HomeSection(TestContext context) {
		//context.log("..inside HomeSection constructor...");
		this.context=context;
	 }
	@Before
	public void before(Scenario scenario) {
		context.createScenario(scenario.getName());
		context.log("before Scenario:  "+scenario.getName());
	}
	
	@After
	public void after(Scenario scenario) {
		context.log("after Scenario: "+scenario.getName());
		context.endScenario();
		System.out.println("-----------------------------------------------------");
		
	}
	
	@Given("I open the application")
    public void i_open_the_application() {
		context.log("I open the application");
       
    }

    @When("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
    	context.log("I navigate to the login page");
        
    }

}
