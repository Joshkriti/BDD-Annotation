Feature: visa conformation Test

  Background:
    Given I am on homepage
    When I click on cookies it should accept my cookies

  Scenario: user should navigate to homepage successfully
    Then I should navigate homepage successfully

  Scenario: user should be able to click on start button
    And I click on start button
    And I choose nationality
    And I click on continue button
    And I click on reason to visit
    And I click on continue button
    Then

