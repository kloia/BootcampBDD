Feature: bootcamp tests

  Background:
    Given homepage is open
    And I close the pop up


  Scenario: Logo verification
    Then logo should be displayed


  Scenario: search result test
    When I search for "shoes"
    Then search result should be seen


  Scenario: sign in page verification
    And I open "Account" dropdown menu
    When I choose "Orders & Purchases" submenu
    Then sign in page should open







