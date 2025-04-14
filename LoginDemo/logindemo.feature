@tag
Feature: Login

  @smoke
  Scenario: To verify login functionlaty of facebook
    Given User had launched the browser
    And navigated to the valid URL
    When user enters email ID and password credentials
    And user clicks on login button
    Then a error message should be displayed
