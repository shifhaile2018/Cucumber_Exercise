package com.qa.examples.cucumber_base;

import java.util.ArrayList;
import java.util.List;

public class Messenger {
	
	private List<User> activeUsers;
	
	public Messenger() {
		this.activeUsers = new ArrayList<User>();
	}

	public void sendMessage(String message, String senderEmail, String receiverEmail) {
		if (message.isBlank() || senderEmail == null || receiverEmail == null) return;
		
		for (var user : activeUsers) {
			if (user.getEmail().equals(receiverEmail)) {
				Message toSend = new Message(message, senderEmail, receiverEmail);
				user.addMessage(toSend);
			}
		}
	}
	
	public User getUserByForename(String forename) {
		for (var user : activeUsers) {
			if (user.getForename().equals(forename)) return user;
		}
		return null;
	}

	public List<User> getActiveUsers() {
		return activeUsers;
	}

	public void addUser(User user) {
		this.activeUsers.add(user);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activeUsers == null) ? 0 : activeUsers.hashCode());
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
		Messenger other = (Messenger) obj;
		if (activeUsers == null) {
			if (other.activeUsers != null)
				return false;
		} else if (!activeUsers.equals(other.activeUsers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Messenger [activeUsers=" + activeUsers + "]";
	}
	
}
