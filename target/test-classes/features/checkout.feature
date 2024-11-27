Feature: eCommerce Checkout

  Scenario: Successful checkout of products
    Given the user is on the login page
    When the user enters the name "Lucas Garcia"
    And the user selects gender "Male"
    And the user selects country "Brazil"
    And the user clicks on Let's Shop
    Then the user adds "PG 3" to the cart
    And the user adds "Jordan 6 Rings" to the cart
    When the user goes to the cart
    Then the user should see the first product "PG 3" in the cart
    Then the user should see the second product "Jordan 6 Rings" in the cart
    When the user agrees to the terms and completes the purchase
    Then the purchase should be completed successfully



    