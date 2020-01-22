package com.designpattern.mediator;

public class MediatorPattern {

	public static void main(String[] args) {
		User sahil = new User("Sahil");
		User sagar = new User("Sagar");

		sahil.sendMessage("Hi! sagar!");
		sagar.sendMessage("Hello! Sahil");
	}

}
