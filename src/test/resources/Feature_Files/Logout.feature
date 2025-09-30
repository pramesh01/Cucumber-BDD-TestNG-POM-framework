@Logout
Feature: Logout functionality

As a registered user
I want to log into the application
So that I can check the Logout functionality

Background:
Given I open the application

Scenario: Validating LogOut functionality 
When I navigate to the login page
And I enter a valid username and password
And I click on the login button
Then I should be logged in successfully
When I click on the logout button
Then I should be logout successfully and redirected to the login page
