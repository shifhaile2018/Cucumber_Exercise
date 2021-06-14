package com.qa.examples.cucumber_base.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {

	final public static String URL = "https://www.saucedemo.com/";

	@FindBy(id = "user-name")
	private WebElement usernameInputField;

	@FindBy(id = "password")
	private WebElement passwordInputField;

	@FindBy(id = "login-button")
	private WebElement loginButton;

	public void fillInLoginDetails(String username, String password) throws InterruptedException {
		usernameInputField.sendKeys(username);
		passwordInputField.sendKeys(password);

		loginButton.submit();
	}
}
