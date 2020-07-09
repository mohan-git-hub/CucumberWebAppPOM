package com.home.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.home.util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[@id='nav-link-accountList']/div/span")
	WebElement UserNameDisplay;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyusername() {
		return UserNameDisplay.getText();
	}

}
