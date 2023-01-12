@Regression

Feature: F02_Login | user should be able to login to the system
  Background: navigation to Demo NopCommerce website Home Page
    Given user navigate to login page

  Scenario: user login with valid data
    When user enter "youssefkenawy778@gmail.com" and "P@ssw0rd"
    Then user click on login button
    And  user could login successfully and go to home page


  Scenario: user login with invalid data
    When user enter "abc@gmail.com" and "Password"
    Then user click on login button
    And  user could not login successfully and go to home page