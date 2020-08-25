package com.home.StepDefinitions;

import org.junit.Assert;

import com.home.context.TestContextUI;
import com.home.pages.HomePage;
import com.home.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class HomePageTestClass extends TestBase{
	
	HomePage HP = new HomePage();
	
	TestContextUI testContextUI;
	
	public HomePageTestClass(TestContextUI testContextUI) {
		this.testContextUI = testContextUI;
	}
	
	@And("^Verify Home Page$")
	public void VerifyUserLogin() {
		Assert.assertEquals("Hello, "+TestBase.prop.getProperty("validUser")+"", HP.verifyusername());
	}


}
