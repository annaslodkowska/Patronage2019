Feature: As a user I want to be able to sort items on automationpractice page

  Scenario Outline: User can sort by <sort method>
    Given I am on automationpractice page
    When I click on "Dresses" on top menu
    And I choose "<sort method>" in "Sort by" drop-down box
    Then Loader is displayed

    Examples: Variations of sort method
      | sort method |
      | Price: Lowest first |
      | Price: Highest first |
      | Product Name: A to Z |
      | Product Name: Z to A |
      | In stock |
      | Reference: Highest first |
      | Reference: Lowest first |