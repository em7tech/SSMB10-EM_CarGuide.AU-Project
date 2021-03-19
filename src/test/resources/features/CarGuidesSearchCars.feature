@Search-Cars
Feature: Acceptance testing to validate Search cars page is working fine.
  In order to validate the search cars page working fine 
  we will do acceptance testing as per the requirement

  #Buisness rule:
  #User can only search cars by selecting value from the dropdown list
  #User have to choose a car brand along with a car model
  #User wont be able to go the next page if any of the value is missing
  Background: 
    Given I am on the home page "https://www.carsguide.com.au/" of CarsGuide website

  @Search-Cars-Positive
  Scenario Outline: Validating Search cars page
    When I move to the top menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And I click on "Search Cars" link
    And select carbrand as "<carBrand>" from Anymake dropdown
    And select carmodel as "<carModel>" from SelectModel dropdown
    And select location as "<location>" from AnyLocation dropdown
    And select price as "<price>" from price dropdown
    And I click on Find_My_Next_Car button
    Then I should see list of search cars "<pageHeader>"
    And the page title should be "<pageTitle>"

    Examples: 
      | carBrand | carModel | location          | price   | pageHeader    | pageTitle                                                      |
      | Audi     | A6       | NSW - Sydney      | $25,000 | under $25,000 | Audi A6 Under 25000 for Sale Sydney NSW \| carsguide           |
      | BMW      | 3 Series | NSW - New England | $20,000 | under $20,000 | Bmw 3 Series Under 20000 for Sale New England NSW \| carsguide |

  @Used-Cars-Positive
  Scenario Outline: Validating Used cars page
    When I move to the top menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And I click on "Used" link
    And select carbrand as "<carBrand>" from Anymake dropdown
    And select carmodel as "<carModel>" from SelectModel dropdown
    And select location as "<location>" from AnyLocation dropdown
    And select price as "<price>" from price dropdown
    And I click on Find_My_Next_Car button
    Then I should see list of search cars "<pageHeader>"
    And the page title should be "<pageTitle>"

    Examples: 
      | carBrand | carModel | location          | price   | pageHeader    | pageTitle                                                           |
      | Audi     | A6       | NSW - Sydney      | $25,000 | under $25,000 | Used Audi A6 Under 25000 for Sale Sydney NSW \| carsguide           |
      | BMW      | 3 Series | NSW - New England | $20,000 | under $20,000 | Used Bmw 3 Series Under 20000 for Sale New England NSW \| carsguide |

  @New-Cars-Positive
  Scenario Outline: Validating New cars page
    When I move to the top menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And I click on "New" link
    And select carbrand as "<carBrand>" from Anymake dropdown
    And select carmodel as "<carModel>" from SelectModel dropdown
    And select location as "<location>" from AnyLocation dropdown
    And select price as "<price>" from price dropdown
    And I click on Find_My_Next_Car button
    Then I should see list of search cars "<pageHeader>"
    And the page title should be "<pageTitle>"

    Examples: 
      | carBrand | carModel | location          | price    | pageHeader     | pageTitle                                                           |
      | Audi     | A6       | NSW - Sydney      | $100,000 | under $100,000 | New Audi A6 Under 100000 for Sale Sydney NSW \| carsguide           |
      | BMW      | 3 Series | NSW - New England | $150,000 | under $150,000 | New Bmw 3 Series Under 150000 for Sale New England NSW \| carsguide |
