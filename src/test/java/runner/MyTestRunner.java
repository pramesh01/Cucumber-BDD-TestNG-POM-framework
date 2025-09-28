package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Feature_Files/Login.feature", 
                 glue = { "stepdef" },
                 plugin = { "pretty","html:target/CucumberReports/Reports.html" }
)

public class MyTestRunner extends AbstractTestNGCucumberTests{

	
}
