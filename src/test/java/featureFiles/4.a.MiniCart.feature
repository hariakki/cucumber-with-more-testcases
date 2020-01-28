Feature: Mini Cart Validation login user and logout user

Scenario Outline: Mini Cart fields and functionality validation login user
    Given User navigates to Magento website
    And Clicks on signin link on the homepage
    Then User place under Customer Login page
    When User enter valid "<username>" username
    When User enter valid "<password>" password
    When User clicks on the signin button
    Then User successfully logged in and placed under homepage
    When User clicks addtocart button on the product under pdp page 
    Then User get success message and product successfully added to the cart
    When User clicks on the minicart
    Then Cart should have added product count and cart item total and cart symbol count should match
    When User clicks on the proceed to checkout button on minicart
    Then User placed under checkout
    Given User navigates to Magento website
    Then User place under homepage
    When User clicks on the minicart
    Then Cart should have added product count and cart item total and cart symbol count should match
    When User clicks on the productname link on the mini cart
    Then User should place under pdp page of that product
    When User clicks on the minicart 
    Then Cart should have added product count and cart item total and cart symbol count should match
    When User selects Quantity text field and update the Quantity
    Then User should see enable update button
    When User clicks on update button
    Then Quantity should be updated with new quantity
    When User selects the edititem link
    Then User place under pdp page
    Then Update cart button are available
    When Click on update cart button
    Then User place under shopping cart page and updated quantity should display
    Then Success message should be displayed  
    When User clicks on the minicart 
    Then Qty should be match to the shopping cart page quantity
    When User clicks View and Edit Cart link
    Then User place under shopping cart page and updated quantity should display
    When User clicks on the minicart
    And  User clicks on the close button on the cart
    Then Cart should close
    When User clicks on the minicart
    Then Mini cart should open
    When User clicks on delete link
    Then Popup window should display for mini cart deletion 
    When User click Cancel button the popup window on mini cart
    Then Popup window closed and minicart still open
    When User clicks on delete link
    Then Popup window should display for mini cart deletion 
    When User clicks ok button on the popup window for minicart deletion
    Then Cart should be empty and following msg should show on the cart You have no items in your shopping cart
    
    Examples:
                            |    username                     |    password     |
                            |  akariveda@sqli.com             |    magento2#    |
                            
 Scenario Outline: Mini Cart fields and functionality validation Logout user
    Given User navigates to Magento website        
     When User clicks addtocart button on the product under pdp page 
    Then User get success message and product successfully added to the cart
    When User clicks on the minicart
    Then Cart should have added product count and cart item total and cart symbol count should match
    When User clicks on the proceed to checkout button on minicart
    Then User should get popup window checkout as new customer
    When User clicks on the minicart
    Then Cart should have added product count and cart item total and cart symbol count should match
    When User clicks on the productname link on the mini cart
    Then User should place under pdp page of that product
    When User clicks on the minicart 
    Then Cart should have added product count and cart item total and cart symbol count should match
    When User selects Quantity text field and update the Quantity
    Then User should see enable update button
    When User clicks on update button 
    Then Quantity should be updated with new quantity
    When User selects the edititem link
    Then User place under pdp page
    Then Update cart button are available
    When Click on update cart button
    Then User place under shopping cart page and updated quantity should display 
    Then Success message should be displayed  
    When User clicks on the minicart 
    Then Qty should be match to the shopping cart page quantity
    When User clicks View and Edit Cart link
    Then User place under shopping cart page and updated quantity should display
    When User clicks on the minicart
    And  User clicks on the close button on the cart
    Then Cart should close
    When User clicks on the minicart
    Then Mini cart should open
    When User clicks on delete link
    Then Popup window should display for mini cart deletion 
    When User click Cancel button the popup window on mini cart
    Then Popup window closed and minicart still open
    When User clicks on delete link
    Then Popup window should display for mini cart deletion 
    When User clicks ok button on the popup window for minicart deletion
    Then Cart should be empty and following msg should show on the cart You have no items in your shopping cart
    
    Examples:
                            |    username                     |    password     |
                            |  akariveda@sqli.com             |    magento2#    |
                            
                             