Feature: As a user I want to be able to sign up for newsletter on automationpractice page

  Scenario: There is no possibility to add invalid email address
    Given I am on automationpractice page
    When I type "aaa.pl" into "Enter your email" and confiirm by Enter
    Then Error message is displayed

  Scenario: There is no possibility to leave empty email address
    Given I am on automationpractice page
    When I type "" into "Enter your email" and confiirm by Enter
    Then Error message is displayed

  Scenario: There is no possibility to use already added email address
    Given I am on automationpractice page
    When I type "qa.patronage@mailinator.com" into "Enter your email" and confiirm by Enter
    Then Error message is displayed
