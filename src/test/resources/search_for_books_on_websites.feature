#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Search_For_Books
Feature: Search for specified books

  Scenario Outline: Searching for books
    Given I have navigated to a website
    When I search for the book title
			| OCP Oracle Certified Professional Java SE 11 Developer Complete Study Guide	| https://www.amazon.com |
			| The Linux Command Line, 2nd Edition	| https://www.amazon.com |
    Then one of the first three books will contain the desired title
    Then the results for the book should be saved
    Then the saved book results should be verified
