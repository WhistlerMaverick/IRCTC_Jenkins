Feature: Nyka search

Background:
Given I am a background task

@Brand
Scenario Outline: I want to seach for tshirt on nyka search bar
	Given I am a customer who launched the website to buy a tshirt "<name>"
	When I am searching into the seach bar by typing tshirt "10"
	And Hit enter key to search
	Then I must be able to see tshirt in my products page
	
	Examples:
	|name|
	|Akash|
	|Nesamani|
