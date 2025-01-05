Feature: Exercise


Scenario Outline: Succesfull login using valid username and password
	Given user launches the application
	Then the user enters "<searchtext>" into the searchbox
	And the user selects "<suggestedTxt>" from the dropdown
	Then the user closes browser
	
	Examples:
	| searchtext	|	suggestedTxt			|
	|	selenium		|	Selenium dioxide	|
	
	