Feature: Logged out user navigate PDP page

Scenario Outline: I select a product and navigate to PDP page as a logged out user
Given user access magneto two website
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

		|	firstname				|	lastname	         |	email					|	password         |
		|Neil						|   Solomon          	 |nelsw121@gmhail.com	    |   Neil890121       |

  