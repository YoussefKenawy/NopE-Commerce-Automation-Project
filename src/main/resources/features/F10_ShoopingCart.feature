

Feature: F010_ShoppingCart  |   user could add products to Cart

  Background: user login first
    When      user navigate to login page
    And       user enter "youssefkenawy778@gmail.com" and "P@ssw0rd"
    Then      user click on login button
    And       user could login successfully and go to home page


  Scenario: success message is visible after adding item to shopping cart
    When    user add item to shopping cart
    Then    shopping cart notification success is visible


