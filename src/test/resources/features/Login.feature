@Regression @login
Feature: Login Feature

  @smoke
  Scenario: valid user name and password
    Given user open browser and app
    When user enter userName
    And user enter password
    And user click on login button
    Then I validate the landing page
