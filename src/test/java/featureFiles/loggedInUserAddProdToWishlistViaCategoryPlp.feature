Feature: Logged In user add product to wishlist via PLP

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
		
Scenario Outline: I select woman category and add prduct to wishlist via PLP as a logged In user
Given user access magneto two website            
When user clicks sign in button  
And user enter "<email>" email 
And user enter "<password>" password 
When user clicks sign in button on sign in page  
Then user successfully logged in  
When user click woman category
And user click Selene Yoga Hoodie 
Then user see Selene Yoga Hoodie pdp page title
And user click size xs 
And user click orrange colour  
When user click add to wishlist on pdp Selene Yoga Hoodie
Then user see add product to wishlist success message
And user see my wishlist heading wishlist page 
And user see Selene Yoga Hoodie product if in wishlist on wishlist page   
And user see close button if in wishlist on wishlist page  
And user see go to wishlist button if in wishlist on wishlist page 
And user see price of item if in wishlist on wishlist page  
And user see add to cart button if in wishlist on wishlist page 
And user see item picture if in wishlist on wishlist page 
And user see qty of items if in wishlist on wishlist page
And user see see update wishlit button  
And user see see share wishlit button  
And user see details button  
Then user see add to cart button on wishlist page


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
	    