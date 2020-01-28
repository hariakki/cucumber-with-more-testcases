Feature: Navigate to the home page and click on the link Create an Account and then user should place under Create New Customer Account and page fields validation.

Scenario Outline: I navigate to to create account page and validate fields
Given user access magneto two website        
When user clicks create account button      
Then user see Create New Customer Account page title 
And user see First Name textfield        
And user see Last Name textfield  
And user see Sign Up for Newsletter tickbox 
And user see Email textfield 
And user see Password textfield
And user see Confirm Password textfield
And user see create account button
Then user see subscribe button    
Examples:

		|	firstname				|	lastname	         |	email					|	password         |
		|Neil						|   Solomon          	 |nel0sw121@gmail.com	    |   Neil890121       |
		


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
		|Neil						|   Solomon          	 |neil2122@yahoo.com	    			|   Neil890121       |
		
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
		|http://devops.magento2.co.za/admin_riwnpv/     |   admin123           |admin		|neil2122@yahoo.com			|
		