@featuretag1 @gghau @featuretag2
Feature: Login page

@Scenariotag1 @Scenariotag2
Scenario: Succesfull login using valid username and password

	Given user launches the application
	Then the user enters into loginPage page
	#When the user enters "<username>" and "<password>"
	And the user enters username and password and submits loginPage Page
	Then the user validates title in MyAccount page
	Then the user closes browser