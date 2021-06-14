package com.qa.examples.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOverviewViewPage {

	@FindBy(id = "finish")
	private WebElement finishTransactionButton;
	
	public void completeTransaction() {
		finishTransactionButton.click();
	}
}
