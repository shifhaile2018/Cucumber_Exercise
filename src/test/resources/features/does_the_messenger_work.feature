#Author: mwalsh@qa.com
Feature: Does the messenger work?

  Testing whether the messenger works or not.

  Scenario: does a receiver receive a message sent
    Given Bob, age 35 with the email bob@email.com is on the messenger
    And Sarah, age 37 with the email sarah@email.com is on the messenger
    When "bob@email.com" sends the message "Hello sarah, how are you" to "sarah@email.com"
    Then "Sarah" receives the message "Hello sarah, how are you" from "Bob"
