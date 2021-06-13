package com.qa.examples.cucumber_base;

public class Message {

	private String message;
	private String senderEmail;
	private String recipientEmail;
	
	public Message() {
		super();
	}

	public Message(String message, String senderEmail, String recipientEmail) {
		super();
		this.message = message;
		this.senderEmail = senderEmail;
		this.recipientEmail = recipientEmail;
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getSender() {
		return senderEmail;
	}
	
	public void setSender(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	
	public String getrecipientEmail() {
		return recipientEmail;
	}
	
	public void setrecipientEmail(String recipientEmail) {
		this.recipientEmail = recipientEmail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((recipientEmail == null) ? 0 : recipientEmail.hashCode());
		result = prime * result + ((senderEmail == null) ? 0 : senderEmail.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (recipientEmail == null) {
			if (other.recipientEmail != null)
				return false;
		} else if (!recipientEmail.equals(other.recipientEmail))
			return false;
		if (senderEmail == null) {
			if (other.senderEmail != null)
				return false;
		} else if (!senderEmail.equals(other.senderEmail))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + ", senderEmail=" + senderEmail + ", recipientEmail=" + recipientEmail + "]";
	}
	
}
