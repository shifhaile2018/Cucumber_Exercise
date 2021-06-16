package com.qa.examples.cucumber_base.step_definitions;

import static org.junit.Assert.assertEquals;

import com.qa.examples.cucumber_base.Message;
import com.qa.examples.cucumber_base.Messenger;
import com.qa.examples.cucumber_base.User;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoesTheMessengerWork {
	
	private Messenger messenger = new Messenger();

	@Given("{word}, age {int} with the email {word} is on the messenger")
	public void isOnTheMessenger(String forename, Integer age, String email) {
		messenger.addUser(new User(forename, "", email, age));
	}

	@When("{string} sends the message {string} to {string}")
	public void sendsTheMessage(String senderEmail, String message, String receiverEmail) {		
		messenger.sendMessage(message, senderEmail, receiverEmail);
	}

	@Then("{string} receives the message {string} from {string}")
	public void receivesTheMessageFrom(String recipientName, String message, String senderName) {
		User recipient = messenger.getUserByForename(recipientName);
		User sender = messenger.getUserByForename(senderName);
		
		Message expectedMessageReceived = new Message(message, sender.getEmail(), recipient.getEmail());
				
		for (var m : recipient.getMessages()) {
			System.out.println(m);
		}
		Message actualMessageReceived = recipient.getMessages().get(0);
		
		assertEquals(expectedMessageReceived, actualMessageReceived);
	}
}
