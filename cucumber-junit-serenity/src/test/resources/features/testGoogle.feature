Feature: Searching by keyword

  Scenario: Should list items related to a specified keyword
    Given I open the homepage 'http://www.google.com'
    When I search for items containing 'donostia'
    Then I should only see items related to 'donostia'