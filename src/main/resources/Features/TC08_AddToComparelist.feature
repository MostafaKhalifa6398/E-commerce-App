@Regression
Feature:
  Scenario: user add two products or more to his wish list so that he can compare the difference
    When user add the products to compare list
    And click on compare production list
    Then user can compare between the selected products