@FunctionalTest
Feature: E2E marketplace

  @SmokeTest @End2End
  Scenario: User is Logged In
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Credentials to LogIn
      | Username   | Password |
      | oanderson189@hidebusiness.xyz | QAtest1234 |
    And User LogOut from the Application
    Then Message displayed LogOut Successfully

  @End2End
  Scenario: Search for product
    Given User is on Home Page
    When User searches for a product
      | Product |
      | notebook acer |
      | celular samsung |
      | mochila reforzada |
      | taza simpsons |
    And User select product profile
    Then Product profile is displayed

  #This scenario is not working yet
  @Regression
  Scenario: Buy a product
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters Credentials to LogIn
      | Username   | Password |
      | oanderson189@hidebusiness.xyz | QAtest1234 |
    And User searches for a product
      | Product |
      | taza simpsons |
    And User select product profile
    And User clicks on buy
    And User adds "Siempreviva" address information
    And User selects shipping address
    Then User selects payment method

  @ShortTest
  Scenario: Search for product
    Given User is on Home Page
    When User searches for a product
      | Product |
      | taza simpsons |
    And User select product profile
    Then Product profile is displayed