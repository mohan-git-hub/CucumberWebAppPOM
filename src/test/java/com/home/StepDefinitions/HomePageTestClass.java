package com.home.StepDefinitions;

import org.junit.Assert;

import com.home.pages.HomePage;
import com.home.util.TestBase;

import cucumber.api.java.en.And;

public class HomePageTestClass extends TestBase{
	
	HomePage HP = new HomePage();
	
	@And("^Verify Home Page$")
	public void VerifyUserLogin() {
		Assert.assertEquals("Hello, "+TestBase.prop.getProperty("validUser")+"", HP.verifyusername());
	}


}
