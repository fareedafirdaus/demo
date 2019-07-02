
Feature: registration of user
 
  Scenario: user is in the registration page
    Given the user is in the registration page
    When user enters the correct username and password
    Then the successful login is made
