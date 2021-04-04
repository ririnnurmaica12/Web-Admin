Feature: Beranda

  Scenario Outline: User try to access beranda
    Given I is logedin use "<userName>" and "<password>"
    When I access beranda page
    Then I view data covid-19

    Examples:
      | userName    | password    |
      | rir         | rir         |
    