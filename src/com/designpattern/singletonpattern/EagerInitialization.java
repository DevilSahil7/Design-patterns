package com.designpattern.singletonpattern;

public class EagerInitialization {

	public static void main(String[] args) {
		EagerInitializedSingleton.getInstance();
	}
}

class EagerInitializedSingleton {
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
		System.out.println("Eager instance created");
	}

	public static EagerInitializedSingleton getInstance() {
		return instance;
	}

}
