package com.qa.examples.cucumber_base.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.qa.examples.cucumber_base.hooks.Hooks;
import com.qa.examples.cucumber_base.pages.SecretSaucePOMRepository;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseItemsOnSecretSauce {
	
	private SecretSaucePOMRepository pom;
	private WebDriver webDriver;
	
	private boolean didOrderCompleteExpected;
	private boolean didOrderCompleteActual;
	
	public PurchaseItemsOnSecretSauce(Hooks hooks) {
		this.webDriver = hooks.getWebDriver();
		this.pom = new SecretSaucePOMRepository(webDriver);
		this.didOrderCompleteExpected = true;
	}
	
	@Given("the user {word} with the password {word} is logged in")
	public void theUserStandardUserWithThePasswordSecretSauce(String username, String password) throws InterruptedException {
		System.out.println(username + " " + password);
	    webDriver.get(pom.landingPage.URL);
		pom.landingPage.fillInLoginDetails(username, password);
	}
	
	@When("the user adds the following items to the cart")
	public void theUserAddsTheFollowingItemsToTheCart(io.cucumber.datatable.DataTable dataTable) {
	    List<String> itemNames = dataTable.asList();
	    
	    for (var itemName : itemNames) {
	    	pom.productsPage.addItemToCart(itemName);
	    }
	}
	
	@When("the user checks out the items")
	public void theUserChecksOutTheItems() {
	    pom.productsPage.navigateToCart();
	    pom.cartPage.navigateToCheckout();
	    pom.checkoutPage.fillInputFieldsWithJunkData();
	    pom.checkoutPage.navigateToCheckoutOverview();
	    pom.checkoutOverviewViewPage.completeTransaction();
	    this.didOrderCompleteActual = pom.checkoutCompletePage.didOrderComplete();
	}
	
	@Then("the purchase is verified via a confirmation page")
	public void thePurchaseIsVerifiedViaAConfirmationPage() {
	    assertEquals(didOrderCompleteExpected, didOrderCompleteActual);
	}
	
}
