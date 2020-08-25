package com.home.context;

import org.openqa.selenium.WebDriver;
import com.home.pages.*;

import cucumber.api.Scenario;

public class TestContextUI {
	
	HomePage homePage;
	LoginPage loginPage;
	
	public HomePage getHomePageObject() {
		return homePage;
	}
	
	public LoginPage getLoginPageObject() {
		return loginPage;
	}
	
	public void initializePageObjects() {
		homePage = new HomePage();
		loginPage = new LoginPage();
	}

}
