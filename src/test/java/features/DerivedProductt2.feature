Feature: Derived Product 2 Page Use Case

  @TC-DP2_02
  Scenario: Validate duplicate hyperlinks on the footer of Derived Product 2 homepage
    Given User navigate to "Derived Prouct 2" homepage
    When User scroll down to footer of the page
    And User gets all links present in footer into csv file
    Then User validates no duplicate link is present in footer