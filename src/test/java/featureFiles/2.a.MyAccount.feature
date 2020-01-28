Feature: MyDashboard Validation

Scenario Outline: User Navigates to the Mydashboard and validation
    Given User navigates to Magento website
    And Clicks on signin link on the homepage
    Then User place under Customer Login page
    When User enter valid "<username>" username
    When User enter valid "<password>" password
    When User clicks on the signin button
    Then User successfully logged in and placed under homepage
    When User Navigates to the myaccount page
    Then User should see my account links section and myaccount page title sections
    When Click on the addressbook link
    Then User placed under addressbook section
    
        Examples:
                            |    username                     |    password     |
                            |  akariveda@sqli.com             |    magento2#    |