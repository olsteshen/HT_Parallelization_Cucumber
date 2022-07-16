@Parallel
Feature: As a user I want to get ability to open a site

  Scenario: Open EPAM site 1
    Given I have configured WebDriver
    When I open Selenium site
    And I verify the header is "Selenium"
    Then I close the browser

  Scenario: Open EPAM site 2
    Given I have configured WebDriver
    When I open Selenium site
    And I verify the header is "Selenium"
    Then I close the browser

  Scenario: Open EPAM site 3
    Given I have configured WebDriver
    When I open Selenium site
    And I verify the header is "Selenium"
    Then I close the browser