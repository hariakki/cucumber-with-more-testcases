Feature: User login to Back End and delete customer saved address

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
		|Neil						|   Solomon          	 |backend@yahoo.com	    				|   Neil890121       |
		
Scenario Outline: user navigate to the Review & Payments, selects payment method and checkout with newly added address
		
		
Given user access magneto two website            
When user clicks sign in button  
And user enter "<email>" email 
And user enter "<password>" password 
When user clicks sign in button on sign in page
And user click woman category
And user click Selene Yoga Hoodie 
And user click size xs  
And user click orrange colour
When user click add to cart    
Then user see add to cart success message
And user see product added to mini cart
When user click on mini cart
Then user see proceed to checkout button
When user clicks proceed to checkout button 
Then user see shipping page 
And user enter "<company>" company 
And user enter "<street1>" street one
And user enter "<street2>" street two 
And user enter "<city>" city
And user enter "<postalcode>" postal code

And user select province
And user select country  
And user enter "<phonenumber>" phone number 
Then user clicks delivery option one 
When user clicks next button 	
When user clicks Place order button	   	
Then user see success order placed page	
  Examples:
|	email			|	password	 |firstname	|lastname  |company	 |street1	 				|street2 				|city 		|phonenumber |	postalcode | province | country     | 
|backend@yahoo.com  |   Neil890121   |Neil		|Solomon   |SQLI	 |100A Newport Great Street |Newport Great Street	|Montevideo	|0607980044	 |10000 	   |A	      |U			|
						
		
		
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
		|http://devops.magento2.co.za/admin_riwnpv/     |   admin123           |admin		|backend@yahoo.com			|	
