Feature: About
  Scenario Outline: User try to access about pages
    Given I is logged in use "<userName>" and "<password>" for test about page
    When I click button about
    Then About page should be "<result>"

    Examples:
      | userName    | password    | result  |
      | rir         | rir         | Success |