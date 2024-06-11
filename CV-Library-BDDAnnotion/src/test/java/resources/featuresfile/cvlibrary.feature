Feature: CV Library Test

  Scenario: user should apply for job
    Given I am on homepage
    And I enter following details
    | jobTitle | location              | distance | salaryMin | salaryMax | salaryType | jobType |
    | Tester   | Harrow, Greater London| 5 miles  | 30000     | 50000     | Per annum  | Permanent|

