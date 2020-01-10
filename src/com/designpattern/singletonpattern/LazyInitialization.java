package com.designpattern.singletonpattern;

public class LazyInitialization {

	public static void main(String[] args) {
		LazyInitializedSingleton.getInstance();

	}

}
class LazyInitializedSingleton{
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {
		System.out.println("Lazy initialization creadtes");
	}
	
	public static LazyInitializedSingleton getInstance() {
		if(instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}
}
