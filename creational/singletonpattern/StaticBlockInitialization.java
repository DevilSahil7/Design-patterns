package com.designpattern.singletonpattern;

public class StaticBlockInitialization {

	public static void main(String[] args) {
		StaticBlockSingleton.getInstance();

	}

}
class StaticBlockSingleton{
	private static StaticBlockSingleton instance;
	private StaticBlockSingleton() {
		System.out.println("Static block initialized");
	}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		}catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
			
		}
	}
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
