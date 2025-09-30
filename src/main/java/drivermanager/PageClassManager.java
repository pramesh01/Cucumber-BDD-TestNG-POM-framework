package drivermanager;

import pageclasses.HomePage;
import pageclasses.LoginPage;
import pageclasses.MyAccountPage;
import pageclasses.SearchPage;

public class PageClassManager {
	
	HomePage homePage;
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	SearchPage searchPage;
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
	
	public SearchPage getSearchPage() {
		if(searchPage==null) {
			searchPage=new SearchPage(webDriverManager);
		}
		return searchPage;
	}

}
