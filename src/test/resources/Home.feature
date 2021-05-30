Feature: Home

  Scenario Outline: User try to access home
    Given I is logged in use "<userName>" and "<password>"
    When I access home page "<result>"
    Then I view data covid "<result>"

    Examples:
      | userName    | password    | result   |
      | rir         | rir         | Success  |
    