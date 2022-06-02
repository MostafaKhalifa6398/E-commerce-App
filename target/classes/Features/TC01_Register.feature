@Regression
Feature:
  Scenario: user open Ecommerce website and navigate to register page
    And click register button
    When user enter valid data
    And user click register button
    Then user could register successfully