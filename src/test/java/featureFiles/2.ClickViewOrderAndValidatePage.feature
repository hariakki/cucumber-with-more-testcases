#Feature: Click view order and validate 
#
#Scenario Outline:  Click view order then validate page
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
#	And user sees Items Ordered
#	And user sees Product Name
#	And user sees SKU
#	And user sees Price
#	And user sees Qty
#	And user sees subtotal		
#	And user sees Shipping & Handling
#	And user sees Tax
#	And user sees Grand Total
#	And user sees Invoices tab
#	When user clicks Invoices tab
#	Then user sees Print All Invoices link
#	And user sees Print Invoice link
#	And user sees Order Shipments
#	When user clicks Order Shipments
#	Then user sees Print All Shipments
#	And user sees Print Shipment
#	And user sees Track this shipment
#	
#	Examples:
#	
#	           |    username                     |    password     				|
#               |  roni_cost@example.com          |    roni_cost3@example.com    | 
#	 
#
#	
