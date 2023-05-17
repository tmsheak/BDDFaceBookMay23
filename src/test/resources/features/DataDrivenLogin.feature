@Regression
Feature: Login Feature with scenario outline

  @dataDriven
  Scenario Outline: valid user name and password for multiple users
    Given Given user open chrome browser and facebook application
    When users enter <userName> in the loginPage
    And users enter <Pssword> in the facebook loginPage
    Then I verify the user is logged in

    Examples: 
      | userName          | Pssword  |
      | "name1@hmail.com" | "123@va" |
      | "name2@hmail.com" | "345@va" |
      | "name3@hmail.com" | "678@va" |
