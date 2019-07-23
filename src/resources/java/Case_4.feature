Feature: Login and purchase an item

Background:
Given User is in Login Page
When User enters valid username and password
Then User directed to home page

@Search1
Scenario: User continues to payment after clicking add to cart button
Given User is in home page
When User searched an item
And Proceed with payment after adding the item
Then User should be directed to payment page

@Search2
Scenario: Attempting to purchase an item without clicking add to cart button
Given User is in home page
When User searched an item
And Attempt to proceed payment without adding the item
Then The cart icon should not be dispalyed