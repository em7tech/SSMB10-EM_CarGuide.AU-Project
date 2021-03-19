Feature: This feature is for sign up functionality for CarGuide.au app
  Description: Explains how sign up function works

  #Buisness rule:
  # All mandatory field should have asterisk sign
  # All field with asterisk sign should get fill up with valid data
  # Any missing field with asterisk sign should have a warning sign
  Background: 
    Given not a existing user
    When user navigate to the application site "https://www.carsguide.com.au/"
    Then home page should display with text "Sign up / Sign in" on right hand corner
    And the page title should be "CarsGuide: Car Reviews - New & Used Car Sales"
    When user click on sign up link
    Then sign up page should display with text "SIGN UP"
    And the new page title should be "Sign In with carsguide"

  @Regression
  Scenario Outline: 1-User able to sign up by entering all the mandatory field
    When user enter email address is "<email>"
    And user enter password is "<password>"
    And user enter first name is "<firstName>"
    And user enter last name is "<lastName>"
    And user click on sign up button
    Then user should see the verification message

    Examples: 
      | email         | password | firstName | lastName |
      | em7@gmail.com | Msem7890 | Mike      | Davis    |
      | em8@gmail.com | Mshj9090 | Tim       | Bunay    |

  @Debug
  Scenario: 2-User not be able to sign up by missing mandatory field
    When user enter email address is ""
    And user enter password is "Msem7890"
    And user click on sign up button
    Then warning sign "Can't be blank" should pop up

  @Smoke
  Scenario Outline: 3-User not be able to sign up without entering password with capital letter or numeric number
    When user enter email address is "<email>"
    And user enter password is "<password>"
    And user click on sign up button
    Then warning sign should pop up

    Examples: 
      | email         | password    |
      | em7@gmail.com | sem7890     |
      | em8@gmail.com | Mseminvalid |
