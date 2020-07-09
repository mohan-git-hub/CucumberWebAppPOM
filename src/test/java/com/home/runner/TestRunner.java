package com.home.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="G:\\Mohan\\Selenium_Software\\WorkSpace\\CucumberPOM\\src\\test\\java\\com\\home\\features\\LoginActivities.feature"
		,glue= {"com.home.StepDefinitions"}
		,format = {"pretty","html:test-output","json:cucumber_result/jsoncucu.json"}
		,plugin = {"html:target/AmazonLoginResult.html","junit:target/cucumberresult.xml"}
		,dryRun = false
		,monochrome = true
		,strict = true
)

public class TestRunner {
}
