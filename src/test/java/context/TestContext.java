package context;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import drivermanager.PageClassManager;
import drivermanager.WebDriverManager;
import utils.ExtentManager;

public class TestContext {
	
	ExtentReports reports;
	ExtentTest extentTest;
	private PageClassManager pageClassManager;
	WebDriverManager webDriverManager;
	
	public TestContext() {
		System.out.println("........Parent TestContext constructor.......");
		reports=ExtentManager.getExtentReports("MyReports.html");
		pageClassManager=new PageClassManager(); // creating Object of the class PageClassManager here
	}
	
	public void createScenario(String scenarioName) {
		
		extentTest = reports.createTest(scenarioName);   // extentTest will be declare here for creating Test.
		this.pageClassManager.getWebDriverManager().init(extentTest);;
	}
	
	public PageClassManager getPageClassManager() {
		return pageClassManager;     // here PageClassManager class object will be returned..
	}
	
	public void endScenario() {
		reports.flush();
	}
	
	
	
	public void log(String msg) {
		extentTest.log(Status.INFO, msg);
	}
	
	public void logFailure(String msg, String screenshotPath) {
	    extentTest.fail(msg).addScreenCaptureFromPath(screenshotPath);
	}
	
}
