Feature: Login Functionality

Scenario Outline: Login
Given User must be registered {int}
When User enters valid credentials
Then User must be in home page
Examples:
|int|
|1|
|2|