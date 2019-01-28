Feature: As a user I want to be able to sign in on automationpractice page

  Scenario: Sign in with proper email address and password
    Given I am on automationpractice page
    When I click on Sign In button in navigation bar
    And I fill email address field in Alredy Registered box with "qa.patronage@mailinator.com"
    And I fill password field in Alredy Registered box with "qa.patronage2019"
    And I click Sign In button in Alredy Registered box
    Then I am logged in

  Scenario: Sign in with proper email address and incorrect password
    Given I am on automationpractice page
    When I click on Sign In button in navigation bar
    And I fill email address field in Alredy Registered box with "qa.patronage@mailinator.com"
    And I fill password field in Alredy Registered box with "qa.patronage"
    And I click Sign In button in Alredy Registered box
    Then I am not logged in
    Then Error message is displayed

  Scenario: Login is not case sensitive
    Given I am on automationpractice page
    When I click on Sign In button in navigation bar
    And I fill email address field in Alredy Registered box with "QA.Patronage@mailinator.com"
    And I fill password field in Alredy Registered box with "qa.patronage2019"
    And I click Sign In button in Alredy Registered box
    Then I am logged in

  Scenario: Password is case sensitive
    Given I am on automationpractice page
    When I click on Sign In button in navigation bar
    And I fill email address field in Alredy Registered box with "qa.patronage@mailinator.com"
    And I fill password field in Alredy Registered box with "QA.Patronage2019"
    And I click Sign In button in Alredy Registered box
    Then I am not logged in
    Then Error message is displayed
