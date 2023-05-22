Feature: Login page of PetStore

#Scenario 1:
Scenario Outline: Login with valid data
Given I am a user who launched the homepage of JPetStore
When I click on the SignIn link
Then SignIn page should be opened
When I enter the username as "<username>"
And I enter the password
And I click on the Login button
Then I should be logged in with my account

Examples:
|username|
|j2ee|

#Scenario 2:
Scenario: Order fish
Given I am a user who launched the homepage of JPetStore
When I click on the SignIn link
Then SignIn page should be opened
When I enter the username
|username|
|j2ee|
And I enter the password
And I click on the Login button
Then I should be logged in with my account
When I click on Fish link
And I click on FI-SW-01
And I click on EST-1
And I click on Add to Cart
And I click on Proceed to Checkout
And I click on Continue
And I click on Confirm
Then My order must be placed

#Scenario 3
Scenario: Order birds
Given I am a user who launched the homepage of JPetStore
When I click on the SignIn link
Then SignIn page should be opened
When I enter the username "j2ee"
And I enter the password
And I click on the Login button
Then I should be logged in with my account
When I click on Bird link
And I click on AV-CB-01
And I click on EST-18
And I click on Add to Cart
And I click on Proceed to Checkout
And I click on Continue
And I click on Confirm
Then My order must be placed
