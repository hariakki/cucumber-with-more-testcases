 Feature: User login with INVALID credentials
 
 Scenario Outline: Login into account with email and INVALID password
 
Given user access magneto two website       
When user clicks sign in button 
And user enter "<email>" email 
And user enter "<password>" password 
When user clicks sign in button on sign in page  
Then user see error message for invalid sign in   

Examples:
	    |	email							|	passsword	|
		|neil0121@yahoo.com 		    |Neil8901212	|
		|11111111111@gmail.1111 	        |Neil890121		|	
	
