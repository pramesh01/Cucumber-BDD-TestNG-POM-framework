package drivermanager;

import pageclasses.HomePage;
import pageclasses.LoginPage;
import pageclasses.MyAccountPage;

public class PageClassManager {
	
	HomePage homePage;
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	WebDriverManager webDriverManager;
	
	public PageClassManager() {
		this.webDriverManager=new WebDriverManager(); //initilizing the WebDriverManager class object here in constructor.
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public HomePage getHomePage() {
		if(homePage==null) {
			homePage=new HomePage(webDriverManager);
		}
		return homePage;
	}

	public LoginPage getLoginPage() {
		if(loginPage==null) {
			loginPage=new LoginPage(webDriverManager);
		}
		return loginPage;
	}
	
	public MyAccountPage getMyAccountPage() {
		if(myAccountPage==null) {
			myAccountPage=new MyAccountPage(webDriverManager);
		}
		return myAccountPage;
	}

}
