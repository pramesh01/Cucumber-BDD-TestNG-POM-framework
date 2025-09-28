Feature: Login functionality

As a registered user
I want to log into the application
So that I can access my account details

Background:
Given I open the application

Scenario: Successful login with valid credentials
When I navigate to the login page
And I enter a valid username and password
And I click on the login button
Then I should be logged in successfully
And I should see my account page