Feature: Logout

  Scenario Outline: User try to logout from aplication
    Given I is logedin use "<userName>" and "<password>"
    When I click link logout
    Then Logout should be "<result>"

    Examples:
      | userName    | password    | result  |
      | rir         | rir         | Success |