@Registration @Regression
Feature: Registration page

  @smoke
  Scenario: I want to build a registration page so that I can collect users
    Given User open app
    When I complete registration page
    And I submit the app
    Then I should be registered
