Feature: Register in the application


Scenario Outline:  Registration Sign-In

        Given User open the browser and entered the URL
		When User click on My Account Menu
		When User enter  '<username>' and '<password>'
		And User click on Register button
		Then User will be register sucesfully
		
		Examples:
		|username|password|
		|chandan@yahoo11234.com|Jaimmaaa@122223hjhj24|
		
		
		
		