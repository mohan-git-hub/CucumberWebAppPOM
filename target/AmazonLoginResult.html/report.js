$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginActivities.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Login Activities in Amazon",
  "description": "",
  "id": "verify-login-activities-in-amazon",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
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
formatter.match({
  "location": "LoginTestClass.LaunchAmazonBrowser()"
});
formatter.result({
  "duration": 42299337600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestClass.VerifyTitle()"
});
formatter.result({
  "duration": 20606300,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestClass.LoginToAmazon()"
});
formatter.result({
  "duration": 20945175500,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "",
  "id": "verify-login-activities-in-amazon;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Smoke"
    },
    {
      "line": 15,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Logout the Amazon application",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestClass.LogoutAmazon()"
});
formatter.result({
  "duration": 15177116500,
  "status": "passed"
});
});