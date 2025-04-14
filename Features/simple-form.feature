 @tag
Feature: Simple Form Submission Test

  @tag1
  Scenario: Validate form is successfully submitted with valid credentials
    Given I am setup browser
    And I am on simple form page
    When I enter first name in the first name field
    And I enter last name in the last name field
    And I enter email in the email field
    And I enter mobile number in the contact number field
    And I enter message in the message field
    And I click on the submit button
    Then I should see the confirmation message
    And I close the tab
