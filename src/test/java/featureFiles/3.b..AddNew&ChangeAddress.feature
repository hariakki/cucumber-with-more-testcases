Feature: AddressBook Validation under chnaging billing address and shipping address

Scenario Outline: Message Validation under billing and shipping address,Add new address
    Given User navigates to Magento website
    And  Clicks on signin link on the homepage
    Then User place under Customer Login page
    When User enter valid "<username>" username
    When User enter valid "<password>" password
    When User clicks on the signin button
    Then User successfully logged in and placed under homepage
    When User Navigates to the myaccount page
    Then User should see my account links section and myaccount page title sections
    When Click on the addressbook link
    Then User placed under addressbook section
    When User clicks Change Billing Address link 
    Then User Place under edit address section
    When User clicks saveaddress button
    Then User place under address book section and you saved the address message should display
    When User clicks Change Shipping Address link
    Then User Place under edit address section
    When User clicks saveaddress button
    Then User place under address book section and you saved the address message should display
    When User clicks Add new address button
    Then User Place Under Add New Address page
    When User capture phonenumber,street address,city,state,zip,country fields 
    Then Data should be capture
    When User clicks saveaddress button
    Then User placed under addressbook section
    Then User place under address book section and you saved the address message should display
    And Saved address should display under additional address entires
      Examples:
                      |    username                     |    password     |
                      |  akariveda@sqli.com             |    magento2#    |
                      
                      
Scenario Outline: Edit address under additional address entries
    Given User navigates to Magento website
    And  Clicks on signin link on the homepage
    Then User place under Customer Login page
    When User enter valid "<username>" username
    When User enter valid "<password>" password
    When User clicks on the signin button
    Then User successfully logged in and placed under homepage
    When User Navigates to the myaccount page
    Then User should see my account links section and myaccount page title sections
    When Click on the addressbook link
    Then User placed under addressbook section
    When User clicks edit address link under additional address entries
    Then User Place under edit address section
    When User selects checkbox for Use as my default billing address
    When User clicks saveaddress button
    Then User placed under addressbook section
    Then User place under address book section and you saved the address message should display
    And Saved address should display under default addresses
    When User clicks Change Billing Address link 
    Then User Place under edit address section
    When User selects checkbox for Use as my default shipping address 
    When User clicks saveaddress button
    Then User placed under addressbook section
    Then User place under address book section and you saved the address message should display
    And Saved address should display under Default Shipping Address
    

      Examples:
                      |    username                     |    password     |
                      |  akariveda@sqli.com             |    magento2#    |
                      
                      
                      
                      
    Scenario Outline: update default billing address and shipping address for delete
    Given User navigates to Magento website
    And  Clicks on signin link on the homepage
    Then User place under Customer Login page
    When User enter valid "<username>" username
    When User enter valid "<password>" password
    When User clicks on the signin button
    Then User successfully logged in and placed under homepage
    When User Navigates to the myaccount page
    Then User should see my account links section and myaccount page title sections
    When Click on the addressbook link
    Then User placed under addressbook section  
    When User clicks Change Billing Address link  
    Then User Place under edit address section
    When User clear street Address
    Then Street address cleared
    When User capture streetaddress
    When User clicks saveaddress button  
    Then User place under address book section and you saved the address message should display
    
               
      Examples:
                      |    username                     |    password     |
                      |  akariveda@sqli.com             |    magento2#    |
                      
                      
   Scenario Outline: Delete address under additional address entries                   
    Given User navigates to Magento website
    And  Clicks on signin link on the homepage
    Then User place under Customer Login page
    When User enter valid "<username>" username
    When User enter valid "<password>" password
    When User clicks on the signin button
    Then User successfully logged in and placed under homepage
    When User Navigates to the myaccount page
    Then User should see my account links section and myaccount page title sections
    When Click on the addressbook link
    Then User placed under addressbook section  
    When User clicks delete address link under additional address entries    
    Then Popup window should display
    When User click Cancel button the popup window
    Then Popup should be closed and user placed under address book section
    When User clicks delete address link under additional address entries
    Then Popup window should display
    When User clicks ok button on the popup window
    Then Popup window will be closed
    And Address deleted from additional address entries
            
             
                      
                
      Examples:
                      |    username                     |    password     |
                      |  akariveda@sqli.com             |    magento2#    |
                      
 