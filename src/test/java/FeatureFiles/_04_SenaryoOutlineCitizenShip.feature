Feature:  Citizenship with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Navigate to Citizenship page

  Scenario Outline: Citizenship create
    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Success message should be displayed

    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Already exist message should be displayed
    And Click on close button

    Examples:
      | CitizenshipName | ShortName |
      | vatanis1        | vatis1    |
      | vatanis2        | vatis2    |
      | vatanis3        | vatis3    |
      | vatanis4        | vatis4    |
      | vatanis5        | vatis5    |


