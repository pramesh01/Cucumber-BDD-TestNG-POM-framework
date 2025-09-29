package drivermanager;

import java.io.FileInputStream;
import java.util.Properties;

public class TestClass {
	static Properties prop;
	public static void main(String[] args) {
		 prop=new Properties();
		 String filePath=System.getProperty("user.dir")+"//src//main//resources//project.properties";
		 
		 try {
			FileInputStream fis=new FileInputStream(filePath);
			prop.load(fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 System.out.println(prop.getProperty("URL"));
			
		 }

	}


