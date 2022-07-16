@Parallel
Feature: As a user I want to get ability to open a site

  Scenario: Open BookDepository site 1
    Given I have configured WebDriver
    When I open bookdepository site
    And I verify the header is "Book Depository: Free delivery worldwide on over 20 million books"
    Then I close the browser


  Scenario: Open BookDepository site 2
    Given I have configured WebDriver
    When I open bookdepository site
    And I verify the header is "Book Depository: Free delivery worldwide on over 20 million books"
    Then I close the browser


  Scenario: Open BookDepository site 3
    Given I have configured WebDriver
    When I open bookdepository site
    And I verify the header is "Book Depository: Free delivery worldwide on over 20 million books"
    Then I close the browser