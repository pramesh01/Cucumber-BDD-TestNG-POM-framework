package context;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utils.ExtentManager;

public class TestContext {
	
	ExtentReports reports;
	ExtentTest extentTest;
	
	public TestContext() {
		System.out.println("........Parent TestContext constructor.......");
		reports=ExtentManager.getExtentReports("MyReports.html");
		//extentTest = reports.createTest(scenario.getName());
	}
	
	public void createScenario(String scenarioName) {
		extentTest = reports.createTest(scenarioName);
	}
	
	public void endScenario() {
		reports.flush();
	}
	
	public void log(String msg) {
		extentTest.log(Status.INFO, msg);
	}
	
}
