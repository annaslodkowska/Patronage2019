Feature: As a user I want to be able to sign in on automationpractice page

  Scenario Outline: User signs in with proper data: <test name>
    Given I am on automationpractice page
    When I click on Sign In button in navigation bar
    And I fill email address field in Already Registered box with "<email>"
    And I fill password field in Already Registered box with "<password>"
    And I click Sign In button in Already Registered box
    Then I am logged in

    Examples: Variations of proper login data
      | test name | email | password |
      | Sign in with proper email address and password | qa.patronage@mailinator.com | qa.patronage2019 |
      | Login is not case sensitive | QA.Patronage@mailinator.com | qa.patronage2019 |

  Scenario Outline: User signs in with invalid data: <test name>
    Given I am on automationpractice page
    When I click on Sign In button in navigation bar
    And I fill email address field in Already Registered box with "<email>"
    And I fill password field in Already Registered box with "<password>"
    And I click Sign In button in Already Registered box
    Then I am not logged in
    Then Error message is displayed

    Examples: Variations of invalid login data
      | test name | email | password |
      | Sign in with proper email address and incorrect password | qa.patronage@mailinator.com | qa.patronage |
      | Password is case sensitive | qa.patronage@mailinator.com | QA.Patronage2019 |
