Feature: Derived Product 1 Page Use Case

  @TC-DP1_01
  Scenario: Count number of slides present under Ticket menu
    Given User navigate to "Derived Prouct 1" homepage
    When User clicks on "Tickets" menu
    Then User validates title of each slide
    And User validates duration each slide is playing