Feature: Register

  Scenario Outline: User try to register in the website
    Given Go to register page
    When Fill the user name "<userName>"
    And Fill the email "<email>"
    And Fill the password "<password>"
    And Fill the first name "<firstName>"
    And Fill the last name "<lastName>"
    And Fill the address "<address>"
    And Click the button submit
    Then Register should be "<result>"


    Examples:
    |userName|email|password|firstName|lastName|address|result|
    |ririn   |ri@gmail.com|ririn|ririn|ririn   |malang |success|