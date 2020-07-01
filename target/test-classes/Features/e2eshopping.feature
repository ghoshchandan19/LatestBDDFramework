Feature: End to End shopping of a product
# Data Driven Scenario with examples using tables
@e2e
Scenario: User purchase a book from the ecommerce site

    Given User open the browser and entered the URL
    When User vists  the shop menu
    And User selects the HTML book product
    And User enters quantity and the book to cart
    And User clicks on shopping cart
    And User moves to checkout page
    And user fills the billing details and places the order
    | First Name |LAST NAME|COMPANY|STREET|TOWN|POSTCODE|
    |Chandan|Ghosh|TTN|SARFABAD|NOIDA|201301|
    Then Order should be placed sucesfully
    

