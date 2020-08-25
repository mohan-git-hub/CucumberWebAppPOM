package com.home.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.home.util.TestBase;
import com.home.util.TestUtil;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Sign in')]")
	WebElement SigninField;
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement UserNameField;
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement ContinueButton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement PasswordField;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement SignInSubmit;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']/span[1]")
	WebElement UserNameDisplay;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	WebElement AccountListField;
	
	@FindBy(xpath="//a[@id='nav-item-signout']")
	WebElement SignOutLink;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateTitle() {
		return driver.getTitle();
	}
	

	
	public HomePage Login() {
		
		SigninField.click();
		//driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
		wait.until(ExpectedConditions.visibilityOf(UserNameField));
		UserNameField.sendKeys(prop.getProperty("username"));
		ContinueButton.click();
		wait.until(ExpectedConditions.visibilityOf(PasswordField));
		PasswordField.sendKeys(prop.getProperty("password"));
		SignInSubmit.click();
		wait.until(ExpectedConditions.visibilityOf(UserNameDisplay));
		return new HomePage();
	}
	
	public void Logout() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		try {
		Actions act = new Actions(driver);
		act.moveToElement(AccountListField).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(SignOutLink));
		jse.executeScript("arguments[0].click()", SignOutLink);
		wait.until(ExpectedConditions.visibilityOf(UserNameField));
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		}
		catch(Exception e) {
		}
	}
	
}
