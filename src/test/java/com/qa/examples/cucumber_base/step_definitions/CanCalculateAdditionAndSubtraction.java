package com.qa.examples.cucumber_base.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CanCalculateAdditionAndSubtraction {

	@Given("a calculator")
	public void aCalculator() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("{int} and {int} are added")
	public void andAreAdded(Integer int1, Integer int2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	
	@When("{int} is subtracted from {int}")
	public void isSubtractedFrom(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Then("the result should be {int}")
	public void theResultShouldBe(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
