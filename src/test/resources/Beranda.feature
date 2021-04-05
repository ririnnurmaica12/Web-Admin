Feature: Beranda

  Scenario Outline: User try to access beranda
    Given I is logedin use "<userName>" and "<password>"
    When I access beranda page "<result>"
    Then I view data covid "<result>"

    Examples:
      | userName    | password    | result   |
      | rir         | rir         | Success  |
    