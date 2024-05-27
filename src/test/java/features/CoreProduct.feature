Feature: Core Product Page Use Case

  @TC-CP_01
  Scenario: Store Jacket Price Title and Top Seller Message
    Given User navigate to "Core Product" homepage
    When User navigate to "Shop Menu > Mens"
    And User finds all jacket over all page present
    Then User stores "Jacket Price", "Title", "Seller Message" into text file

  @TC-CP_02
  Scenario: Count total number of video feeds present over UI
    Given User navigate to "Core Product" homepage
#    When User navigates to "New & Features" under kebab menu
#    And User counts the total number of video feeds present over UI
#    And User counts video feeds "3" days prior then present day