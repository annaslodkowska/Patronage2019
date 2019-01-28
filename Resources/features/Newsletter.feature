Feature: As a user I want to be able to sign up for newsletter on automationpractice page

  Scenario: There is no possibility to add invalid email address
    Given I am on automationpractice page
    When I type "aaa.pl" into "Enter your email" and confirm by Enter
    Then Error message is displayed

  Scenario: There is no possibility to leave empty email address
    Given I am on automationpractice page
    When I type "" into "Enter your email" and confirm by Enter
    Then Error message is displayed

  Scenario: There is no possibility to use already added email address
    Given I am on automationpractice page
    When I type "qa.patronage@mailinator.com" into "Enter your email" and confirm by Enter
    Then Error message is displayed

  Scenario: Sign up to newsletter confirmed by next button
    Given I am on automationpractice page
    When I type "aaa.pl" into "Enter your email"
    And I click next button in "Enter your email" section
    Then Error message is displayed