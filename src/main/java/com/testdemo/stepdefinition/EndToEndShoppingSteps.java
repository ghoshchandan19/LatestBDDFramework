package com.testdemo.stepdefinition;

import java.util.List;
import java.util.Map;

import com.testdemo.Utils.TestBase;
import com.testdemo.managers.PageObjectManager;
import com.testdemo.pageFeatures.BasketFeature;
import com.testdemo.pageFeatures.CheckoutFeature;
import com.testdemo.pageFeatures.HomePageFeature;
import com.testdemo.pageFeatures.ProductFeature;
import com.testdemo.pageFeatures.ShopFeature;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class EndToEndShoppingSteps extends TestBase {

	HomePageFeature hmf;
	ShopFeature sf;
	ProductFeature pf;
	PageObjectManager pom;
	BasketFeature basketFeature;

	@When("User vists  the shop menu")
	public void user_vists_the_shop_menu() {
		hmf = new HomePageFeature(driver);
		hmf.clickOnShopMenu();

	}

	@When("User selects the HTML book product")
	public void user_selects_the_HTML_book_product() {
		sf = new ShopFeature(driver);
		sf.selectHtmlBook();

	}

	@When("User enters quantity and the book to cart")
	public void user_enters_quantity_and_the_book_to_cart() {
		pf = new ProductFeature(driver);
		pf.enterQuantity();
		pf.addToBasket();
	}

	@When("User clicks on shopping cart")
	public void user_clicks_on_shopping_cart() {
		pf.clickOnCart();
	}

	@When("User moves to checkout page")
	public void user_moves_to_checkout_page() {
		pom = new PageObjectManager(driver);
		BasketFeature basketFeature = pom.getBasketFeature();
		// BasketFeature bf = new BasketFeature(driver);
		basketFeature.clickOnCheckout();
	}

	@When("user fills the billing details and places the order")
	public void user_fills_the_billing_details_and_places_the_order(DataTable billingDetails) {

		List<Map<String, String>> data = billingDetails.asMaps(String.class, String.class);
		CheckoutFeature cf = new CheckoutFeature(driver);
		cf.enterFirstName(data.get(0).get("First Name"));
		cf.enterLastName(data.get(0).get("LAST NAME"));
		cf.enterEmail("ghoshchandan19@gmail.com");
		cf.enterPhn("8882663236");
		cf.enterAddr(data.get(0).get("STREET"));
		cf.enterCompany(data.get(0).get("COMPANY"));
		cf.enterTown(data.get(0).get("TOWN"));
		cf.enterPost(data.get(0).get("POSTCODE"));

		cf.placeOrder();

	}

	@Then("Order should be placed sucesfully")
	public void order_should_be_placed_sucesfully() {

	}

}
