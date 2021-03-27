Feature: Login

  Scenario Outline: User try to login
    Given I navigate to login page
    When I enter user name as "<username>"
    And I enter password as "<password>"
    And I click login button
    Then Login should be "<result>"

    Examples:
      | username    | password    | result  |
      | rir         | rir         | Success |