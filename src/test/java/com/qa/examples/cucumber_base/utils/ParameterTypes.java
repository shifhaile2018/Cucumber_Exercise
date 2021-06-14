package com.qa.examples.cucumber_base.utils;

import com.qa.examples.cucumber_base.Message;

import io.cucumber.java.ParameterType;

public class ParameterTypes {

	@ParameterType(value = ".*")
	public Message message(String msg) {
		Message toReturn = new Message();
		toReturn.setMessage(msg);
		
		return toReturn;
	}
}
