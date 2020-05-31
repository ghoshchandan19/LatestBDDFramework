Feature: Testing for login page

@SmokeTest
Scenario: Log-in with valid username and password

		Given User open the browser and entered the URL
		When User click on My Account Menu
		When User enter registered username and password
		When User click on the Login Button
		Then User is able to login into the application
		And  User succesfully logout from the application
		
		
@Smoke
Scenario: Log-in with valid username and invalid password
        Given User open the browser and entered the URL
		When User click on My Account Menu
		When User enter registered username and invalid password
		When User click on the Login Button
		Then User is not able to login into the application
 
