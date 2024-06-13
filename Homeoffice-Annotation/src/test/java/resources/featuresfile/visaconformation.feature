Feature: visa conformation Test

  Background:
    Given I am on homepage

  Scenario: user should navigate to homepage successfully
    Then I should navigate homepage successfully

  Scenario: user should be able to apply for visa with different nationality
    And I click on cookies it should accept my cookies
    And I click on start button
    And I select nationality "Australia"
    And I click on continue button
    And I click on reason to visit
    And I click on second continue button
    Then I should verify text message successfully

  Scenario: user should be able to apply for visa with different nationality
    And I click on cookies it should accept my cookies
    And I click on start button
    And I select nationality "Chile"
    And I click on continue button
    And I select job type
    And I click on second continue button
    And I select length of stay
    And I click on third continue button
    And I select job type again
    And I click on forth button
    Then I should verify text message successfully to visit UK

  Scenario: user should be able to apply for visa with different nationality
    And I click on cookies it should accept my cookies
    And I click on start button
    And I select nationality "Colombia"
    And I click on continue button
    And I click on reason to visit UK
    And I click on second continue button
    Then I should verify text message successfully not visit UK









