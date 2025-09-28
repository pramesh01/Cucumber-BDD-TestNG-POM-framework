package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	private static ExtentReports extentReports;

	public static ExtentReports getExtentReports(String reportName) {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		String timeStamp = sdf.format(d);
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "//ExtentReports//" + timeStamp + "_" + reportName);
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);
		return extentReports;

	}
}
