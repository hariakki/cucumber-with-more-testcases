Feature: review & Payments

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
		|Neil						|   Solomon          	 |ship@yahoo.com	    				|   Neil890121       |


Scenario Outline: user navigate to the SHIPPING section and VALIDATE SHIPPING page fields
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
And user see Company textbox name
And user see Company textbox  
And user see Street Address textbox name
And user see Street Address textbox one
And user see Street Address textbox two
And user see City textbox name
And user see City textbox 
And user see State/Province textbox name
And user see State/Province textbox
And user see Zip/Postal Code textbox name
And user see Zip/Postal Code textbox
And user see Country textbox name
And user see Country textbox 
And user see Phone Number textbox name
And user see Phone Number textbox
And user see Shipping Methods heading
And user see flat rate delivery tickbox
And user see best way delivery tickbox
And user see Order Summary 
And user see Order Summary dropdown list button
Then user see next button 

  Examples:
		|	email					|	password	         |
		|ship@yahoo.com       |   Neil890121           |
        
        
 
 
 
 
Scenario Outline: user navigate to the PAYMENT METHOD SECTION and validate Payment Method page
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
And user enter "<phonenumber>" phone number 
And user enter "<postalcode>" postal code
And user select province
And user select country
Then user clicks delivery option one 
When user clicks next button  
Then user see payment method page title
And user see My billing and shipping address are the same tickbox 
And user see my billing and shipping address 
And user see Order Summary 
And user see Order Summary dropdown list button
And user see cart total  
And user see shipping 
And user see order total 
And user see order total Rand amount 
And user see qty items in cart 
And user see ship to 
And user see shipping method 
And user see apply discount code 
And user see apply discount code dropdown list button 
Then user see Place order button 

  Examples:
|	email		|	password	 |firstname	|lastname  |company	 |street1	 	|street2 |city 		|phonenumber |	postalcode | province | country     | 
|ship@yahoo.com |   Neil890121   |Neil		|Solomon   |SQLI	 |21 Grove Road |Glenlily|Cape Town	|0607980044	 |10000		   |A	 	  |U			|
						
Scenario Outline: user navigate to the PAYMENT METHOD SECTION and checkout with no details captured and see error message of required fields
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
And user clicks delivery option one 
When user clicks next button   
Then user see required field error messages 

  Examples:
|	email		|	password	 |firstname	|lastname  |company	 |street1	 	|street2 |city 		|phonenumber |	postalcode | province | country     | 
|ship@yahoo.com |   Neil890121   |Neil		|Solomon   |SQLI	 |21 Grove Road |Glenlily|Cape Town	|0607980044	 |10000 	   |A	  	  |            U| 
			
		
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
|	email		|	password	 |firstname	|lastname  |company	 |street1	 				|street2 				|city 		|phonenumber |	postalcode | province | country     | 
|ship@yahoo.com |   Neil890121   |Neil		|Solomon   |SQLI	 |100A Newport Great Street |Newport Great Street	|Montevideo	|0607980044	 |10000 	   |A	      |U			|
						
				
		
		
Scenario Outline: user navigate to the Review & Payements, selects payment method and checkout with SAVED ADDRRESS
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
And user see new address button  
Then user clicks delivery option one  
When user clicks next button 
When user clicks Place order button
Then user see success order placed page       

  Examples:
|	email		|	password	 |firstname	|lastname  |company	 |street1	 	|street2 |city 		|phonenumber |	postalcode | province | country     | 
|ship@yahoo.com |   Neil890121   |Neil		|Solomon   |SQLI	 |21 Grove Road |Glenlily|Cape Town	|0607980044	 |7500		   |A	  |U|
		
		



		
	
	
Scenario Outline: user navigate to the Review & Payements, selects payment method and checkout with NEW ADRRESS by clicking NEW ADDRESS button
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
Then user clicks delivery option one 
And user clicks new address button
And user enter "<company>" company  
And user enter "<street1>" street one
And user enter "<street2>" street two 
And user enter "<city>" city
And user enter "<phone>" phone number new
And user enter "<postcode>" postal code new  
And user select province 
When user clicks save address button     
When user clicks next button 
When user clicks Place order button
Then user see success order placed page       

  Examples:
|	email		  |	password	   |firstname	|lastname  |company	 |street1	 	|street2 |city 		|phonenumber |	postalcode  | province | country     |  postcode     |  phone     |
|ship@yahoo.com   |   Neil890121   |Neil		|Solomon   |SQLI	 |21 Grove Road |Glenlily|Anchorage |0607980044	 |35801    		|A	  	   |U            | 35801     	 |0607980044  |
				
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
		|http://devops.magento2.co.za/admin_riwnpv/     |   admin123           |admin		|ship@yahoo.com				|		