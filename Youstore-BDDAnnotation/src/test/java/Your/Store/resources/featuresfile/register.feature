Feature: Register

  Background:
    Given I am on homepage

  Scenario: User should create account successfully
    When I click on register link
    And I enter following user details
    | fName | lName | Email                | Telephone   | Password | cPassword |
    | Kriti | Josh  | Kritijosh15@gmail.com| 07716294878 | Kom1234  | Kom1234   |

    And I click on radio button
    And I click on privacy policy check box
    And I click on continue button
    Then I should register to register page successfully

