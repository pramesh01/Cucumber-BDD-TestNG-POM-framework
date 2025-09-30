@Search
Feature: Product Search functionality

As a logged-in customer
I want to search for products
So that I can view and purchase items available on the site

Background:
Given I open the application
And I navigate to the login page
And I enter a valid username and password
And I click on the login button
Then I should be logged in successfully

@Search
Scenario: Search for an existing product
When I search for "Printed Summer Dress"
Then I should see product results related to "Printed Summer Dress"

Scenario: Search for a non-existing product
When I search for "FlyingCar"
Then I should see a message that no products were found