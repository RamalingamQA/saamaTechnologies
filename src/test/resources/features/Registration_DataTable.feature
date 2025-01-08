Feature: Registration Page


Scenario: Succesfull login using valid username and password
	Given user launches the application
	Then the user enters into register page
	And the user fills all the required fields in Registations page and registers it
	| firstName	| lastName	|	eMail	|	telePhone	|	password	|	confirmPassword	|
	|	Akash	|	Kumar	|	test@abc	|	8900987653	|	test@abc	|	test@abc	|	
	|	Sanga	|	Raj	|	test@def	|	8900987653	|	test@def	|	test@def	|	
	|	Vinu	|	Chakravarty	|	test@ghi	|	8900987653	|	test@ghi	|	test@ghi	|	
	Then the user closes browser
	
