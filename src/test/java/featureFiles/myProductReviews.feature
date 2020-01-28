Feature: User navigates to My Product Reviews section

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
		|Neil						|   Solomon          	 |product@review.com	    			|   Neil890121       |
		
Scenario Outline: Logged IN user navigate to PDP and add a product review
		 
		
Given user access magneto two website            
When user clicks sign in button  
And user enter "<email>" email 
And user enter "<password>" password 
When user clicks sign in button on sign in page
And user click woman category
And user click Selene Yoga Hoodie 
And user click size xs   
And user click orrange colour
When user clicks reviews tab 
Then user see your rating header   
And user see label rating one to five 
And user see nickname textbox name  
And user see nickname textbox  
And user see summary textbox name  
And user see summary textbox 
And user see review textbox name
And user see review textbox
And user see submit review button 
And user clicks label rating five
And user enter "<nickname>" nickname
And user enter "<summary>" summary
And user enter "<review>" review
When user clicks submit review button
Then user see success submitted review message 
And user navigate to my account page 
When user clicks my product reviews  
Then user see My Product Reviews Page 
And user see created coloumn 
And user see product name coloumn 
And user see rating coloumn 
And user see review coloumn  

  Examples:
		|	email					|	password	         |	nickname	|summary         |	review	    |
		|product@review.com          |   Neil890121           |Jabba			|abcdefg@12$!@#%@#|qazZAQ!@#123	|
		
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
		|http://devops.magento2.co.za/admin_riwnpv/     |   admin123           |admin		|product@review.com 		|

Scenario Outline: Logged OUT user navigate to PDP and add a product review
		
		
Given user access magneto two website            

And user click woman category
And user click Selene Yoga Hoodie 
And user click size xs   
And user click orrange colour
When user clicks reviews tab 

And user clicks label rating five
And user enter "<nickname>" nickname
And user enter "<summary>" summary
And user enter "<review>" review 
When user clicks submit review button
Then user see success submitted review message 
Then user see pdp page title
  Examples:
		|	email					|	password	         |	nickname	|summary         |	review	    |
		|product@review.com       |   Neil890121           |Jabba			|abcdefg@12$!@#%@#|qazZAQ!@#123	|
		
		
		