@Login
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

Scenario: Login with Invalid credentials
When I navigate to the login page
And I enter a Invalid username and password
And I click on the login button
Then I should not be allowed to log in and warning message should appear

Scenario Outline: Login functionality with multiple credentials
When I navigate to the login page
And I enter username '<username>' and password '<password>'
And I click on the login button

Examples:
| username                    | password        |
| bloggerdelhi123@gmail.com   | Password        |
| invaliduser@gmail.com       | wrongpass       |
|                             | somepass        |