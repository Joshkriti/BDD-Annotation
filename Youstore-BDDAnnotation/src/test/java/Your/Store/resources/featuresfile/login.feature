Feature: Login

  Background:
    Given I am on homepage
    When I click on login link

  Scenario: User should navigate to login page successfully with valid credentials
    And I enter email "Kritijosh14@gmail.com"
    And I enter password "Kom1234"
    And I click on login button
    Then I should login to login page successfully

  Scenario Outline: verify multiple user
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    And I should see error message "<errorMessage>"
    Examples:
      | email                 | password | errorMessage |
      | Kritijosh140@gmail.com | Kom1234  | Warning: No match for E-Mail Address and/or Password. |
      | Kritijosh@gmail.com   | Kom1234  | Warning: No match for E-Mail Address and/or Password. |