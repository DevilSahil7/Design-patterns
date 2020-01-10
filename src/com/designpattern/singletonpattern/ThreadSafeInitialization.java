package com.designpattern.singletonpattern;

public class ThreadSafeInitialization {

	public static void main(String[] args) {
		ThreadSafeSingleton.getInstance();
	}

}

class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
		System.out.println("Thread Safe instance created");
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
