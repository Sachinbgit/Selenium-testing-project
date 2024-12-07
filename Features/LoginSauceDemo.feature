Feature: Login

  Scenario Outline: Verify login functionality of saucedemo site.
    Given Launch browser And open Saucedemo site.
    When Enter "<username>" in username field And Enter "<password>" in password field.
    And Click on login button.
    Then Validate login is successful.

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |
