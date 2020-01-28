Feature: Login user navigate to the My account and then click on the account information link then page fields validation

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

Scenario Outline: user login and navigate to My Account page and validate all elements
Given user access magneto two website            
When user clicks sign in button  
And user enter "<email>" email 
And user enter "<password>" password 
When user clicks sign in button on sign in page
Then user successfully logged in 
When user navigate to my account page
And user see my dashboard page title
And user see whats new; woman; men; gear; training and sale categories
And user see account dashboard my account page  
And user see my orders
And user see my downloadable products my account 
And user see my wishlist my account 
And user see address book
And user see account information
And user see billing agreements
And user see my product reviews
And user see newsletter subscribtions
And user see sub compare products heading wishlist page  
And user see products if in compare list wishlist page
And user see my wishlist my account    
And user see products if in wishlist wishlist page
And user see subscribe button  
And user see search textbox
And user see logged in welcome message
And user see user profile dropdown box
And user see mini cart
And user see about us
And user see customer service
And user see privacy and cookie policy
And user see search items
And user see advanced search
And user see contact us
And user see subscribe button textbox 
And user see account information heading   
And user see contact information heading
And user see newsletters heading
And user see contact information edit button
And user see change password button
And user see newsletters edit button
And user see address book
And user see manage address book button
And user see default billing address heading
And user see default billing address edit address button
And user see default shipping address heading
And user see default shipping address edit address button
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
		