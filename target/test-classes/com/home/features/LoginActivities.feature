Feature: Verify Login Activities in Amazon

Background: 
Given Launch Amazon Site
When Title of the Page is verified
Then Login into Amazon

@Smoke
Scenario: Verify the scenario
When Title of the Page is verified
Given Launch Amazon Site
Then Login into Amazon
And Verify Home Page

@Smoke @Sanity
Scenario:
Then Logout the Amazon application
 