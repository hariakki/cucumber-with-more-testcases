Feature: Shopping cart validation

Scenario Outline: User add products to the cart and navigate to the shopping cart then page fields validation
    Given User navigates to Magento website 
     And Clicks on signin link on the homepage
    Then User place under Customer Login page
    When User enter valid "<username>" username
    When User enter valid "<password>" password 
    When User clicks on the signin button
    When User clicks addtocart button on the product under pdp page 
    Then User get success message and product successfully added to the cart
    When User navigate to the shopping cart page
    Then User placed under shopping cart page
    Then User should see product information table section under shopping cart page
    Then User should see summary table section under shopping cart page
    Then User should see apply discount code section under shopping cart page
    When User clicks Apply Discount Code
    Then Apply discount code textfield, apply discount buttons should dispaly
    When User clicks Estimate Shipping and Tax drop down 
    Then Country,zip postal code fields should display
    
    
    
   Examples:
                            |    username                     |    password     |
                            |  akariveda@sqli.com             |    magento2#    |


  Scenario Outline: User validates qty and edit link under shopping cart  
     Given User navigates to Magento website 
     And Clicks on signin link on the homepage
     Then User place under Customer Login page
     When User enter valid "<username>" username
     When User enter valid "<password>" password 
     When User clicks on the signin button
     When User navigate to the shopping cart page
     When User selects the qty textfield and clear the textfield
     When User capture qty into textfield 
     When User clicks update shopping cart button
     Then Qty should be match to the shopping cart page quantity
     When User clicks edit link
     Then User place under pdp page
     Then Update cart button are available
     #When User selects Quantity text field 
     When Click on update cart button
     Then User place under shopping cart page and updated quantity should display 
     Then Success message should be displayed 
                           
          
   Examples:
                            |    username                     |    password     |
                            |  akariveda@sqli.com             |    magento2#    |      
                                    
                               
                            
                            
 Scenario Outline: User validates proceedtocheckout and apply discount code
     Given User navigates to Magento website 
     And Clicks on signin link on the homepage
     Then User place under Customer Login page
     When User enter valid "<username>" username
     When User enter valid "<password>" password 
     When User clicks on the signin button
     When User navigate to the shopping cart page
     When User clicks on proceed to checkout button on shopping cart page
     Then User placed under checkout
     When User navigate to the shopping cart page
     Then User placed under shopping cart page
     When User clicks Apply Discount Code
     When User clicks on apply discount button
     Then Required field message should be dispalyed as This is a required field
#     When User capture discount code 
#     When User clicks on apply discount button
#     Then You used coupon code qacoupon success message should be dispalyed
#     When User clicks Apply Discount Code
#     Then Cancel coupon button should be dispalyed
#     When User clicks on cancel coupon button
#     Then You canceled the coupon code message should be dispalyed
     
     
 
   Examples:
                            |    username                     |    password     |
                            |  akariveda@sqli.com             |    magento2#    |   
                            
                            
                            
     Scenario Outline: User adds invalid discount code
     Given User navigates to Magento website 
     And Clicks on signin link on the homepage
     Then User place under Customer Login page
     When User enter valid "<username>" username
     When User enter valid "<password>" password 
     When User clicks on the signin button
     When User navigate to the shopping cart page
     When User clicks Apply Discount Code
     When User capture invalid discount code
     When User clicks on apply discount button
     Then User get validation message
     #When User clicks Apply Discount Code
 
      
    Examples:
                            |    username                     |    password     |
                            |  akariveda@sqli.com             |    magento2#    |                            
                            
                            
                            
                            
     Scenario Outline: User validates Move to wishlist link and delete link
     Given User navigates to Magento website 
     And Clicks on signin link on the homepage
     Then User place under Customer Login page
     When User enter valid "<username>" username
     When User enter valid "<password>" password 
     When User clicks on the signin button
     When User navigate to the shopping cart page
     When User clicks move to wishlist link
     Then User place under shopping cart section
     Then User get success message under shopping cart
     When User navigate to the wishlist 
     Then User place under wishlist section
     Then User moved product should available here
#    Given User navigates to Magento website
#    When User clicks addtocart button on the product under pdp page 
#    Then User get success message and product successfully added to the cart
     When User clicks AddAllToCart button under wishlist
     Then Product moved from wishlist to cart 
     When User navigate to the shopping cart page
     When User click delete link under shopping cart
     Then User place under shopping cart section 
     
     
     
    Examples:
                            |    username                     |    password     |
                            |  akariveda@sqli.com             |    magento2#    |  

 



                                                