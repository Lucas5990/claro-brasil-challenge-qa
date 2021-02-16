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
    @BurnsData
    Scenario: Should create an account successfully
    Given I navigate to the URL "http://automationpractice.com"
    And I left click at the Sign In button
    And I write "teste@lucasmail.com" in the Create Account Email input
    When I click at the Create an Account button
    And I select the option "11" at the Days combo box
    And I select the option "10" at the Month combo box
    And I select the option "1994" at the Year combo box
    And I check the Mr radio button
    And I write "Lucas" into First Name Input
    And I write "Andrade" into Last Name Input
 		And I write "123qwe" into Password Input
 		And I write "Test Street, 123" into Address Input
 		And I write "Chicago" into City Input
 		And I write "60007" into Zip Code Input
 		And I select "Alabama" at the State combo box
 		And I select "United States" at the Country combo box
 		And I write "999881122" into Mobile Phone input
 		And I click the Register Button
 		Then I should see the message "Welcome to your account. Here you can manage all of your personal information and orders." in screen
