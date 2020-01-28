Feature: Logged In user add all to cart via wishlist page

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
		
Scenario Outline: Logged in user add item to cart via wishlist page
Given user access magneto two website            
When user clicks sign in button  
And user enter "<email>" email 
And user enter "<password>" password 
When user clicks sign in button on sign in page
And user click woman category
And user click Selene Yoga Hoodie 
And user click size xs  
And user click orrange colour  
And user click add to wishlist on pdp Selene Yoga Hoodie
And user see add product to wishlist success message
Then user see my wishlist heading wishlist page
When user click add all to cart
And user see add all to cart from wishlist success message 
Then user see item added to mini cart



  Examples:
		|	email					|	password	         |
		|neil0121@yahoo.com         |   Neil890121           |
		
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