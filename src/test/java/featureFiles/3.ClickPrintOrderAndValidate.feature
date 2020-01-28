#Feature: Click print order and validate 
#
#Scenario Outline:  Click print order then validate page
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
#	And user should see the Reorder link
#	Then user should see the View Order link
#	When user clicks on view orders link 
#	Then user placed under order page
#	Then user sees Reorder
#	And user sees Print Order
#	When user clicks on the Print Order link
#	Then user placed under printing page
#	And user should see print button
#	And user should see cancel button
#	Then user should see the destination label
#	Then user should see the layout label
#	Then user should see the pages label
#	Then user should see the color label
#	
#	Examples:
#	
#	           |    username                     |    password     				|
#               |  roni_cost@example.com          |    roni_cost3@example.com    | 
#	 