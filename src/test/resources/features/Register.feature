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
@tag
Feature: Register new Account
  I want to use this template for my feature file

    @SignIn
    Scenario: Should create an account successfully
    When I navigate to the URL "http://automationpractice.com"
    And I left click at the Sign In button
    And I write "tste@gmail.com" in the Create Account Email input
    Then I click at the Create an Account button
    And I select the option "11" at the Days combo box
