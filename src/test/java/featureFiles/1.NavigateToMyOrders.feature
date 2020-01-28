#Feature: Navigate to My Orders under My Account
#
#
#Scenario Outline: Navigate to My Orders under My Account
#	Given user access the Magento site
#	When user clicks Sign In link
#	Then user placed under customer login page
#	Then User enter valid "<username>" username
#    Then User enter valid "<password>" password
#	When user clicks on the Sign In button
#	Then user placed under my home page
#	When user navigates to customer account
#	And user clicks on my orders tab
#	Then user should see orders
#	And user sees order number
#	And user sees order date
#	And user sees ship to
#	And user sees order total
#	And user sees status
#	Then user sees action.
#	
#	Examples:
#	
#	           |    username                     |    password     				|
#               |  roni_cost@example.com          |    roni_cost3@example.com    | 
#