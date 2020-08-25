package com.home.util;

import java.io.FileInputStream;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriverWait wait;

	public TestBase() {
		try {
		prop = new Properties();
		FileInputStream FIS = new FileInputStream("G:\\Mohan\\Selenium_Software\\WorkSpace\\CucumberPOM\\src\\test\\java\\com\\home\\config\\config.properties");
		prop.load(FIS);
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
	public static void Initialization() {
		if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\Mohan\\Selenium_Software\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\Mohan\\Selenium_Software\\FirefoxDriver\\geckodriver.exe");
			driver = new FirefoxDriver();		
		}
		wait = new WebDriverWait(driver,30);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Sign in')]")));

	}
	
}
