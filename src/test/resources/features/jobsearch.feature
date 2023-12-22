@Regression
Feature: Search functionality of CV Library

  Scenario Outline: Search job on CV Library Website
    Given I am on homepage
    And I enter job title "<jobTitle>"
    And I enter location "<location>"
    And I select distance "<distance>"
    And I enter salary minimum "<salaryMin>"
    And I enter salary maximum "<salaryMax>"
    And I select salary type "<salaryType>"
    And I select job type "<jobType>"
    And I click on find Jobs button
    Then I verify the result "<result>"

    Examples:
      | jobTitle | location | distance | salaryMin | salaryMax | salaryType | jobType   | result                                      |
      | Tester   | Harrow   | 5 miles  | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill |
      | Tester   | London   | 25 miles | 20000     | 600000    | Per annum  | Permanent | Permanent Tester jobs in London             |