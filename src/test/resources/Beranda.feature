Feature: Beranda

  Scenario: User try to access beranda
    Given I is logedin
    When I access beranda page
    Then I view data covid-19
