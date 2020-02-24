package com.jayesh.service;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService {

	public List<String> getWelcomeMessage(String name)
	{
		List<String> myWelcomeMessage=new ArrayList<String>();
		myWelcomeMessage.add("Hello");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add("Welcome To Emp Life.");
		return myWelcomeMessage;
		
	}
}
