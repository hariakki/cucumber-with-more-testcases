Feature: AddressBook Validation

Scenario Outline: Signin into account with correct credentails and navigate to the Addressbook
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
    And User should see deafult addresses, default billing address,default shipping address, Change Billing Address,Change Shipping Address,Additional Address Entries,Add new address button
    When User clicks Change Billing Address link 
    Then User Place under edit address section
    Then User should see Edit Address, Contact Information, First Name ,Last Name ,Company,Phone Number, Address,Street Address,City,State/Province,Zip/Postal Code, Country,Save Address
    When User clicks back Navigation on webpage 
    Then User placed under addressbook section
    When User clicks Change Shipping Address link
    Then User Place under edit address section
    And User should see Edit Address, Contact Information, First Name ,Last Name ,Company,Phone Number, Address,Street Address,City,State/Province,Zip/Postal Code, Country,Save Address
    When User clicks back Navigation on webpage 
    Then User placed under addressbook section
    When User clicks Add new address button
    Then User Place Under Add New Address page
    And User should see Contact Information, First Name ,Last Name ,Company,Phone Number, Address,Street Address,City,State/Province,Zip/Postal Code, Country,Use as my default billing address,Use as my default shipping address,Save Address                   
      Examples:
                      |    username                     |    password     |
                      |  akariveda@sqli.com             |    magento2#    |
 
                    

Scenario Outline: Required field validation at address book
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
    When User clicks Add new address button
    Then User Place Under Add New Address page
    When User clicks saveaddress button
    Then Phone Number,Street Address,City,Zip Postal Code fields are displayed This is a required field. message under textboxes and StateProvinc drop down is displayed Please select an option. under dropdown selection
   


      Examples:
                      |    username                     |    password     |
                      |  akariveda@sqli.com             |    magento2#    |
                      
                      
# When ever db change create the above user and save the above mentioned default billing address and shipping address before run 3.a, 3.b tests
                    