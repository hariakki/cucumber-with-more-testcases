#Feature: Navigate to Newsletter Subscriptions then subscribe and validate 
#
#Scenario Outline:  Navigate to Newsletter Subscriptions then subscribe and validate page
#	Given user access the Magento site
#	When user clicks Sign In link
#	Then user placed under customer login page
#	Then User enter valid "<username>" username
#    Then User enter valid "<password>" password
#	When user clicks on the Sign In button
#	Then user placed under my home page
#	When user navigates to customer account
#	And user clicks on Newsletter Subscriptions tab
#	Then user sees Newsletter Subscription text
#	And user sees Subscription option text
#	And user sees General Subscription checkbox
#	When user checks on General Subscription checkbox
#	And user clicks Save button
#	Then user sees We saved the subscription message
#		Examples:
#	
#	           |    username                     |    password     				|
#               |  roni_cost@example.com          |    roni_cost3@example.com    | 
#	 
#	Scenario Outline:  Navigate to Newsletter Subscriptions then unsubscribe and validate page
#	Given user access the Magento site
#	When user clicks Sign In link
#	Then user placed under customer login page
#	Then User enter valid "<username>" username
#    Then User enter valid "<password>" password
#	When user clicks on the Sign In button
#	Then user placed under my home page
#	When user navigates to customer account
#	And user clicks on Newsletter Subscriptions tab
#	Then user sees Newsletter Subscription text
#	And user sees Subscription option text
#	And user sees General Subscription checkbox
#	When user checks on General Subscription checkbox
#	And user clicks Save button
#	Then user sees We removed the subscription message
#		Examples:
#	
#	           |    username                     |    password     				|
#               |  roni_cost@example.com          |    roni_cost3@example.com    |  
