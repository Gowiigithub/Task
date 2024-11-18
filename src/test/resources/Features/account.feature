Feature: Account Management

  Scenario: Create a new account
    Given A user visits the website
    When They enter valid registration details
    Then The account is created, and the user is logged in

  Scenario: Sign in with valid credentials
    Given A user is on the login page
    When They enter valid credentials
    Then The user is redirected to their account dashboard