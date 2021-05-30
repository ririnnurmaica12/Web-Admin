Feature: Logout

  Scenario Outline: User try to logout from aplication
    Given I is logged in use "<userName>" and "<password>" for test the logout
    When I click link logout
    Then Logout should be "<result>"

    Examples:
      | userName    | password    | result  |
      | rir         | rir         | Success |