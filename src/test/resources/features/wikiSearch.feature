Feature: Wikipedia Search functionality and verification

  #we can also pass number like WSF-4523(potential ticket number) or aglie story here

  Scenario:  Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And  User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title


  Scenario: Wikipedia Search Functionality Header Verification
    Given  User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And  User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header


  @scenarioOutline
  Scenario Outline:  Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And  User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to be using in this scenario is as below
      | searchValue | expectedTitle | expectedMainHeader |
      | Steve Jobs  | Steve Jobs    | Steve Jobs         |
      | Bob Marley  | Bob Marley    | Bob Marley         |
      | Bill Gates  | Bill Gates    | Bill Gates         |
      | Lady Gaga   | Lady Gaga     | Lady Gaga          |
      | Marie Curie | Marie Curie   | Marie Curie        |