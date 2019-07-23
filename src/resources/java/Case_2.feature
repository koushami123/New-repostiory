Feature: Login with different users
Scenario Outline: Login
Given User is in Login page
When user enters <username> <password>
Then user is in home page
Examples:
|username||password|
|"Lalitha"||"Password123"|
|"asha123"||"password"|