Feature: Logged out user add product to wishlist via PDP

Scenario Outline: I navigate to to create account page and Capture vaild details and successfully create an account 

Given User navigates to Magento website     
When user clicks create account button  
And user enter valid "<firstname>" First Name
And user enter valid "<lastname>" Last Name
And user tick Sign Up for Newsletter tickbox 
And user enter valid "<email>" Email 
And user enter valid "<password>" Password
And user enter valid matching "<password>" Confirm Password 
When user click create account button
And user see My Dashboard page 
Then user see successful create account message 
Examples:

		|	firstname				|	lastname	         |	email								|	password          |
		|Neil						|   Solomon          	 |neil0121@yahoo.com	    			|   Neil890121       |
		
Scenario Outline: I select woman category and validate pdp as a logged out user
Given user access magneto two website
When user click woman category
Then user see plp page title
And user see home in breadcrumb
And user see base page title woman 
And user see sub category tops title
And user see sub category hoodies & sweatshirts under tops
And user see sub category jackets under tops 
And user see sub category tees under tops 
And user see sub category bars & tanks under tops 
And user see sub category bottoms title
And user see sub category pants under bottoms 
And user see sub category shorts under bottoms
And user see sub compare products heading Plp
And user see products if in compare list Plp
And user see my wishlist heading Plp
And user see products if in wishlist Plp
And user see selene yoga hoodie product
And user see radiant tee product
And user see breathe easy tank product
Then user see subscribe button 
When user click Selene Yoga Hoodie 
Then user see Selene Yoga Hoodie pdp page title
When user click add to wishlist on pdp Selene Yoga Hoodie
Then user see customer login page
And user enter "<email>" email 
And user enter "<password>" password 
When user clicks sign in button on sign in page 
Then user see my wishlist base page


Examples:
		|	email							|	password	         |
		|neil0121@yahoo.com          |   Neil890121           |
		
Scenario Outline: Login into account with valid username and password and delete registered user account on back end
Given user access magneto two back end website        
And user enter "<username>" username 
And user enter "<password>" password back end            
When user clicks back end sign in button          
And user clicks customers        
And user clicks all customers  
And user search for "<regemail>" 
When user clicks edit button  
When user clicks delete customer button  
And user clicks ok button
       
      
 
Examples:
		|	urlBackEnd									|	password	       |username 	|regemail					|
		|http://devops.magento2.co.za/admin_riwnpv/     |   admin123           |admin		|neil0121@yahoo.com			|			
	
