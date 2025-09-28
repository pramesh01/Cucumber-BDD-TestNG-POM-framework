package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {

	//WebDriver driver;

	public static String takeScreenshot(WebDriver driver,String name) {
	Date date=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("HH-mm-ss");
	String timeStamp=sdf.format(date);
	
	TakesScreenshot screenShot=(TakesScreenshot)driver;
	String path=System.getProperty("user.dir")+"//Screenshot//"+name+"-"+timeStamp+".png";
	File screenshotDataSource=screenShot.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(screenshotDataSource, new File(path));
	} catch (IOException e) {
		e.printStackTrace();
	}
	return path;

}
}
