package hooks;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ExtentManager;
import utils.TakeScreenshot;

public class Hooks {
	
	private TestContext context;

    public Hooks(TestContext context) {
        this.context = context;
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        context.createScenario(scenario.getName());
        context.log("Before Scenario: " + scenario.getName());
    }

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            String path = TakeScreenshot.takeScreenshot(
                    context.getPageClassManager().getWebDriverManager().getDriver(),
                    scenario.getName());
            context.logFailure("Step failed, screenshot captured", path);
        }
    }

    @After
    public void afterScenario(Scenario scenario) {
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
    
    @AfterAll
    public static void afterAll() {
        // Flush once for the whole ececution run gets completed..
        ExtentManager.flushReports();
    }

}
