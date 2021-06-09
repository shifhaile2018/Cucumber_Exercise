#Author: mwalsh@qa.com

Feature: Can calculate addition and subtraction correctly?
  To test whether addition and subtraction return the correct
  results.

  Scenario: Three add four is seven
    Given a calculator
    When three and four are added
    Then the result should be seven

  Scenario: Four subtract three is one
    Given a calculator
    When three is subtracted from four
    Then the result should be one
