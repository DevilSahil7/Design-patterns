package com.designpattern.singletonpattern;

public class BillPughInitialization {

	public static void main(String[] args) {
		BillPughSingleton.getInstanve();

	}

}

class BillPughSingleton {
	private BillPughSingleton() {
		System.out.println("Bill Pugh instance created");
	}

	private static class SingletoneHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();

	}

	public static BillPughSingleton getInstanve() {
		return SingletoneHelper.INSTANCE;
	}
}