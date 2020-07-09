$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:/Mohan/Selenium_Software/WorkSpace/CucumberPOM/src/test/java/com/home/features/LoginActivities.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Login Activities in Amazon",
  "description": "",
  "id": "verify-login-activities-in-amazon",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "verify-login-activities-in-amazon;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Launch Amazon Site",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of the Page is verified",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Login into Amazon",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestClass.LaunchAmazonBrowser()"
});
formatter.result({
  "duration": 61382916400,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestClass.VerifyTitle()"
});
formatter.result({
  "duration": 22277800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestClass.LoginToAmazon()"
});
formatter.result({
  "duration": 19029874600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTestClass.VerifyUserLogin()"
});
formatter.result({
  "duration": 48148300,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "",
  "description": "",
  "id": "verify-login-activities-in-amazon;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Logout the Amazon application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestClass.LogoutAmazon()"
});
formatter.result({
  "duration": 16000423900,
  "status": "passed"
});
});