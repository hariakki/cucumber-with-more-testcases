Feature: Logged in user navigate PDP page

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
		
Scenario Outline: I select a product and navigate to PDP page as a logged in user
Given user access magneto two website
When user clicks sign in button  
And user enter "<email>" email 
And user enter "<password>" password 
When user clicks sign in button on sign in page  
Then user successfully logged in 
When user click fusion backpack 
Then user see pdp page title
And user see price
And user see in stock
And user see SKU
And user see QTY text
And user see QTY amount box
And user see add to cart button
And user see add to wishlist button
And user see add to add to compare button
And user see details tab
And user see more information tab
And user see reviews tab
Then user see subscribe button 
 
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
	
	