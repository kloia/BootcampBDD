Feature: bootcamp tests

  Background:
    Given homepage is open
    And I close the pop up


  Scenario: Logo verification
    Then logo should be displayed


    Scenario: search result test
      When I search for "shoes"
      Then search result should be seen




