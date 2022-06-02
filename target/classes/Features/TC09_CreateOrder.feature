@Regression
Feature:
  Scenario: user create successful order
    When user login with valid username and password
    And user select product and add it to cart and confirm adding
    And user click on shopping cart button
    And user agree the terms and click on checkout button
    And user enter shipping Address
    And user enter shipping method
    And user enter payment method
    And user enter payment Information
    And user confirm his order
    Then the order made successfully
