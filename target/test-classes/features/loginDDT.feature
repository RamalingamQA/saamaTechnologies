Feature: Login page


Scenario Outline: Succesfull login using valid username and password
	Given user launches the application
	Then the user enters into loginPage page
	When the user enters "<username>" and "<password>"
	Then the user validates title in MyAccount page
	Then the user closes browser
	
	Examples:
	 		| username            | password  |
      | tester@xyz.com      | test@123  |
      | dev@xyz.com         | dev@123   |
      | support@xyz.com     | support@123 |
	