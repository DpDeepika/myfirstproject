Feature: validating login field for facebook users.
Scenario: validating login with incorrect username and incorrect password.
Given user need to launch fb application on chrome browser.
When user enters username and password
And user click on login button.
Then user need to validate home page screen.