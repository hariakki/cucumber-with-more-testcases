#Feature: Click Stored Payment Methods and validate 
#
#Scenario Outline:  Click Stored Payment Methods then validate page
#	Given user access the Magento site
#	When user clicks Sign In link
#	Then user placed under customer login page
#	Then User enter valid "<username>" username
#    Then User enter valid "<password>" password
#	When user clicks on the Sign In button
#	Then user placed under my home page
#	When user navigates to customer account
#	And user clicks on Stored Payment Methods tab
#	Then user sees Stored Payment Methods text
#		Examples:
#	
#	           |    username                     |    password     				|
#               |  roni_cost@example.com          |    roni_cost3@example.com    | 
#	 