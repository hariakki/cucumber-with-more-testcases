Feature: Signin into account 

Scenario Outline: Signin into account with correct credentails
    Given User navigates to Magento website
    And Clicks on signin link on the homepage
    Then User place under Customer Login page
    When User enter valid "<username>" username
    When User enter valid "<password>" password
    When User clicks on the signin button
    Then User successfully logged in and placed under homepage
    
        Examples:
                            |    username                     |    password     |
                            |  akariveda@sqli.com             |    magento2#    |