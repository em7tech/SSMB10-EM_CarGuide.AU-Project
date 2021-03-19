Feature: This functionality describe the signIn feature for CarGuide.au application
  Description: Explains how sign in function works

  # Business Rule:
  # Valid email with valid password will be able to sign in
  # Invalid email with valid password will not be able to sign in
  # Valid email with invalid password will not be able to sign in
  # No email with valid password will not be able to sign in
  # Valid email wtih no password will not be able to sign in
  Background: 
    Given not a existing user
    When user navigate to the application site "https://www.carsguide.com.au/"
    Then home page should display with text "Sign up / Sign in" on right hand corner
    And the page title should be "CarsGuide: Car Reviews - New & Used Car Sales"
    When user click on sign in link
    Then sign in page should display "Sign In with carsguide"

  @Debug
  Scenario: User able to sign in with valid email and valid password
    When user click on sign in tab
    And user enter email address is "bsemran@hotmail.com"
    And user enter password is "Mse67890"
    And user click on sign in button
    Then home page should display "CarsGuide: Car Reviews - New & Used Car Sales"
    And user name "Mike" display at the top right corner

  Scenario: User not be able to sign in with invalid email and invalid password
    When user click on sign in tab
    And user enter email address is "invalid89@hotmail.com"
    And user enter password is "invalid67890"
    And user click on sign in button
    Then sign in page display "Sign In with carsguide"
    And error message should display with "Wrong email or password."

  Scenario: User not be able to sign in with valid email and empty password
    When user click on sign in tab
    And user enter email address is "bsemran@hotmail.com"
    And user enter password is ""
    And user click on sign in button
    Then sign in page display "Sign In with carsguide"
    And warning sign "Can't be blank" should pop up

  Scenario: User not be able to sign in with empty email and empty password
    When user click on sign in tab
    And user enter email address is ""
    And user enter password is ""
    And user click on sign in button
    Then sign in page display "Sign In with carsguide"
    And warning sign "Can't be blank" should pop up
