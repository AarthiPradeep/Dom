Feature: Placing order in Dominos Website
  Scenario: Place Order Pizza
    Given  launch the  url
    When  Enter your Delivery Address
    And Enter your Area.
#   And Click locate me
    And Go to veg pizza tab
    And Add Two quantities of Margherita pizza to the cart
    And Add Two Quantities of Peppy Paneer pizza to the cart
    And Go to dessert Tab.
    And Add choco lava cake to the cart
    And Recheck the cart to delete an item from cart
    Then Click the checkout button

    #simplyyy