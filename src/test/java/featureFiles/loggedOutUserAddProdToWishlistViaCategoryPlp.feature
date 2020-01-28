#Feature: Logged out user add product to wihslist via PLP
#
#Scenario Outline: I select woman category and validate plp as a logged out user
#Given user access magneto two website
#When user click woman category
#Then user see plp page title
#And user see home in breadcrumb 
#And user see woman in breadcrumb 
#And user see base page title woman 
#And user see sub category tops title
#And user see sub category hoodies & sweatshirts under tops
#And user see sub category jackets under tops 
#And user see sub category tees under tops 
#And user see sub category bars & tanks under tops 
#And user see sub category bottoms title
#And user see sub category pants under bottoms 
#And user see sub category shorts under bottoms
#And user see sub compare products heading Plp
#And user see products if in compare list Plp
#And user see my wishlist heading Plp
#And user see products if in wishlist Plp   
#And user see selene yoga hoodie product 
#And user see radiant tee product
#And user see breathe easy tank product 
#Then user see subscribe button 
#
#Examples:
#		|	email					|	password	         |
#		|neil0121@yahoo.com         |   Neil890121           |
#		
#Scenario Outline: I select woman category and add prduct to wishlist via plp as a logged out user		
#Given user access magneto two website
#When user click woman category
#Then user see plp page title
#When user click add to wshlist on product selene yoga hoodie	
#Then user see customer login page
#And user enter "<email>" email 
#And user enter "<password>" password 
#When user clicks sign in button on sign in page 
#Then user see my wishlist base page
#And user see whats new; woman; men; gear; training and sale categories
#And user see account dashboard
#And user see my orders
#And user see my downloadable products
#And user see my wishlist
#And user see address book
#And user see account information
#And user see stored payment methods
#And user see billing agreements
#And user see my product reviews
#And user see newsletter subscribtions
#And user see sub compare products heading wishlist page  
#And user see products if in compare list wishlist page
#And user see my wishlist heading wishlist page    
#And user see products if in wishlist wishlist page
#And user see subscribe button
#And user see message you have no items in your wishlist
#And user see search textbox
#And user see logged in welcome message
#And user see user profile dropdown box
#And user see mini cart
#And user see about us
#And user see customer service
#And user see privacy and cookie policy
#And user see search items
#And user see advanced search
#And user see contact us
#Then user see subscribe button textbox   
#
#
#
#Examples:
#		|	email							|	password	         |
#		|neil0121@yahoo.com       			|   Neil890121           |
#
#	
