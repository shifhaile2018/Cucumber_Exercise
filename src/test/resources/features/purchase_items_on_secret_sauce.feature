Feature: Purchase items on secret sauce

  Scenario Outline: Purchase items and verify the purchase
    Given the user standard_user with the password secret_sauce is logged in
    When the user adds the following items to the cart
			| Sauce Labs Backpack	|
			| Sauce Labs Bike Light	|
    When the user checks out the items
    Then the purchase is verified via a confirmation page
