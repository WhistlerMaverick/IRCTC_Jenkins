Feature: LinkedIn signup

Scenario: Creating an account with valid data
Given I am a user who wants to create an account launches the LinkedIn signup page
When I click on the email field, I provide my email as “user@gmail.com”
And I click on the password field, I provide my password as “User@123”
And I click on the Agree and Join button
Then I must have my account created
And My profile must be visible