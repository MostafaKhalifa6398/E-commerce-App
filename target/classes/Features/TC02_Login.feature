@Regression
Feature:
  Scenario: user open Ecommerce website and navigate to register page
    And click login
    When user enter valid Email and password
    And user click login button
    Then user could login successfully