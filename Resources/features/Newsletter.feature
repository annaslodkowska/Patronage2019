Feature: As a user I want to be able to sign up for newsletter on automationpractice page

  Scenario: Sign up to newsletter confirmed by next button
    Given I am on automationpractice page
    When I type "aaa.pl" into "Enter your email"
    And I click next button in "Enter your email" section
    Then Error message is displayed

  Scenario Outline: User signs up in newsletter with invalid data: <test name>
    Given I am on automationpractice page
    When I type "<email>" into "Enter your email" and confirm by Enter
    Then Error message is displayed

  Examples: Variations of email used to sign up for newsletter
    | test name | email |
    | There is no possibility to add invalid email address | aaa.pl |
    | There is no possibility to leave empty email address | |
    | There is no possibility to use already added email address | qa.patronage@mailinator.com |
