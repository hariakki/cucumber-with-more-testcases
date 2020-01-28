#Feature: Search for product and validate 
#
#Scenario Outline:  Logged out user searches for product and validate page
#	Given user access the Magento site
#	When user enters valid "<productname>" product name
#	And user clicks on the Search Icon
#	Then user placed under product listing page
#	And user sees "<productname>"
#	And user sees reviews
#	And user sees price
#	And user sees sizes
#	
#		Examples:
#	
#	           |  productname          |   
#               |  Juno Jacket          |
#
#               Scenario Outline:  Logged in user searches for product and validate page
#	
#	Given user access the Magento site
#	When user clicks Sign In link
#	Then user placed under customer login page
#	Then User enter valid "<username>" username
#    Then User enter valid "<password>" password
#	When user clicks on the Sign In button
#	Then user placed under my home page
#	When user enters valid "<productname>" product name
#	And user clicks on the Search Icon
#	Then user placed under product listing page
#	And user sees "<productname>"
#	And user sees reviews
#	And user sees price
#	And user sees sizes
#	
#		Examples:
#	
#	           |    username                     |    password     				|	productname          |
#               |  roni_cost@example.com          |    roni_cost3@example.com    | 	Juno Jacket          | 