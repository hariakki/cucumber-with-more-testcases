Feature: Users creation after environment build

Scenario Outline: Creating new users after building environment 
    Given User navigates to Magento website
    And Clicks on signin link on the homepage
    Then User place under Customer Login page
    When User enter valid "<username>" username
    When User enter valid "<password>" password
    When User clicks on the signin button
    Then User successfully logged in and placed under myaccount if failed create accounts by using "<firstname>" , "<lastname>", "<email>","<password>" firstname,lastname,email,password

   Examples:
              |firstname			    |	lastname	         | email								|	password          |    username                     | 
		      |anusha					|   kariveda          	 | akariveda@sqli.com	    		    |   magento2#         |akariveda@sqli.com	            |
		      |anusha					|   kariveda          	 | qatesting.commerce@gmail.com	        |   magento2#         |qatesting.commerce@gmail.com	    |

Scenario Outline: Adding test data to newly created users
    Given User navigates to Magento website
    And Clicks on signin link on the homepage
    Then User place under Customer Login page
    When User enter valid "<username>" username
    When User enter valid "<password>" password
    When User clicks on the signin button
    When User Navigates to the myaccount page
    Then User should see my account links section and myaccount page title sections
    When Click on the addressbook link
    When User capture phonenumber,street address,city,state,zip,country fields if user placed under add new address page
   
  Examples:
             |    username                     |    password     |
             |  akariveda@sqli.com             |    magento2#    |   
                            
Scenario Outline: User deleting additional address entires if available
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
    When User should delete the address if additional addresses are available
    Then User should see text You have no other address entries in your address book. under additional address entries

   Examples:
             |    username                     |    password     |
             |  akariveda@sqli.com             |    magento2#    |
                            
                            




