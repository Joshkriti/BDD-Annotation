Feature: CV Library Test

  Scenario: user should navigate to homepage successfully
    Then I should navigate to homepage successfully

  Scenario: user should apply for job
    Given I am on homepage
    And I enter following details
    | jobTitle | location | distance | salaryMin | salaryMax | salaryType | jobType |



