@Regression
Feature:
  Scenario: user add products to his shopping cart
    When user select product and click add to cart
    And determine the quantity of products and click add to cart
    Then product added to cart successfully
