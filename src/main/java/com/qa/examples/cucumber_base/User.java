package com.qa.examples.cucumber_base;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String forename;
	private String surname;
	private String email;
	private int age;
	
	private List<Message> messages;
	
	public User(String forename, String surname, String email, int age) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.email = email;
		this.age = age;
		this.messages = new ArrayList<Message>();
	}

	public List<Message> getMessages() {
		if (messages == null) this.messages = new ArrayList<>();
		return messages;
	}

	public void addMessage(Message message) {
		if (messages == null) this.messages = new ArrayList<>();
		this.messages.add(message);
	}

	public String getForename() {
		return forename;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((forename == null) ? 0 : forename.hashCode());
		result = prime * result + ((messages == null) ? 0 : messages.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (forename == null) {
			if (other.forename != null)
				return false;
		} else if (!forename.equals(other.forename))
			return false;
		if (messages == null) {
			if (other.messages != null)
				return false;
		} else if (!messages.equals(other.messages))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [forename=" + forename + ", surname=" + surname + ", email=" + email + ", age=" + age
				+ ", messages=" + messages + "]";
	}
	
}
