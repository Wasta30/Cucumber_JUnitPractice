Feature: Google search functionality
  Agile story : As a user, whenver I am on the Google search page
  I should be able to search whatever I want and see relevant information

  Scenario: Search page title verification
    When user is on Google search page
    Then user should see title is Google



    Scenario: Search functionality result title verification
      Given user is on Google search page
      And user accept key
      When user types apple and clicks enter
      Then user sees apple in the google  title


  Scenario: Search functionality result title verification
    Given user is on Google search page
    And user accept key
    When user types "apple" and clicks enter
    Then user sees "apple" in the google  title




    #it can only accept one word so not a good approacch , we can use either word os string but we can not use two words but we can use string we can use two diff words