Feature: About
  Scenario Outline: User try to access about pages
    Given I is logedin use "<userName>" and "<password>"
    When I click button about
    Then About page should be "<result>"

    Examples:
      | userName    | password    | result  |
      | rir         | rir         | Success |