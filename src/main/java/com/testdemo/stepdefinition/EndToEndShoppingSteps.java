package com.testdemo.stepdefinition;

import com.testdemo.Utils.TestBase;
import com.testdemo.pageFeatures.HomePageFeature;
import com.testdemo.pageFeatures.ProductFeature;
import com.testdemo.pageFeatures.ShopFeature;

import cucumber.api.java.en.When;

public class EndToEndShoppingSteps extends TestBase {
	
	HomePageFeature hmf;
	ShopFeature sf;
	ProductFeature pf;
	
	@When("User vists  the shop menu")
	public void user_vists_the_shop_menu() {
		hmf=new HomePageFeature(driver);
		hmf.clickOnShopMenu();
	 
	}

	@When("User selects the HTML book product")
	public void user_selects_the_HTML_book_product() {
		sf=new ShopFeature(driver);
		sf.selectHtmlBook();
		
		
	}

	@When("User enters quantity and the book to cart")
	public void user_enters_quantity_and_the_book_to_cart() {
	   pf=new ProductFeature(driver);
	   pf.enterQuantity();
	   pf.addToBasket();
	}


	

}
