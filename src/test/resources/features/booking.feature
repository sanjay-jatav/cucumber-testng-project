@tag
Feature: Flight Booking

  @smoke
  Scenario: Successful flight booking
    Given user is on the booking page
    When user selects departure, destination cities
    And user click on find flights
    Then booking confirmation page is displayed
