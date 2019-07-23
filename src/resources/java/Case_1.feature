Feature: Register functionality

Scenario: Regiater with valid credentials
Given User is in Sign up page
When User enters username as "asha123",firstname as "Play",lastname as "house", password as"password",confirm password as "password"
And selects gender as female,email as "kos@gmail.com",mobile no as"4536271890"
And enters dob as "08/06/1997", address as "nagercoil", selects one security question and enters answer as "yellow"
Then User must be in Login page