@Regression
Feature: Data driven Registration page

  @DataDrivenReg
  Scenario Outline: Registration page for multiple users
    Given user open facebook homepage
    When user enter <firstName> and <lastName>
    And user enter <mobileNumber>
    And user enter <month> and <day> and <year>
    And user select gender
    And user click reg button
    Then I verify registration page is created

    Examples: 
      | firstName | lastName | mobileNumber | month | day  | year   |
      | "Tarek11" | "Kabir1" | "2127184466" | "Jan" | "03" | "1975" |
      | "Tarek22" | "Kabir2" | "2127184477" | "Feb" | "06" | "1999" |
      | "Tarek33" | "Kabir3" | "2127184488" | "Mar" | "11" | "2001" |
      | "Tarek44" | "Kabir4" | "2127184499" | "Dec" | "12" | "2005" |
