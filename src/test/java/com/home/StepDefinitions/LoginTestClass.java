package com.home.StepDefinitions;

import org.junit.Assert;

import com.home.pages.HomePage;
import com.home.pages.LoginPage;
import com.home.util.TestBase;

import cucumber.api.java.en.*;

public class LoginTestClass extends TestBase{
	
	LoginPage LP = new LoginPage();
	HomePage HP = new HomePage();

@Given("^Launch Amazon Site$")
public void LaunchAmazonBrowser() {
	TestBase.Initialization();
}

@When("^Title of the Page is verified$")
public void VerifyTitle() {
	LP = new LoginPage();
	Assert.assertEquals(LP.ValidateTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
}

@Then("^Login into Amazon$")
public void LoginToAmazon() {
	HP = LP.Login();
}

@Then("^Logout the Amazon application$")
public void LogoutAmazon() {
	LP.Logout();
}
}
