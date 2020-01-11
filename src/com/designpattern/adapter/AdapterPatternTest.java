package com.designpattern.adapter;

public class AdapterPatternTest {

	public static void main(String[] args) {

		testObjectAdapter();
		testClassAdapter();
	}

	private static Volts getVolts(SocketAdapter socketAdapter, int i) {
		switch (i) {
		case 3:
			return socketAdapter.get3Volts();

		case 12:
			return socketAdapter.get12Volts();

		case 120:
			return socketAdapter.get120Volts();

		default:
			return socketAdapter.get120Volts();
		}
	}

	private static void testObjectAdapter() {
		SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
		Volts v3 = getVolts(socketAdapter, 3);
		Volts v12 = getVolts(socketAdapter, 12);
		Volts v120 = getVolts(socketAdapter, 120);
		System.out.println("3 volts using object adapter: "+v3.getVolts());
		System.out.println("12 volts using object adapter: "+v12.getVolts());
		System.out.println("120 volts using object adapter: "+v120.getVolts());
	}
	
	private static void testClassAdapter() {
		SocketAdapter socketAdapter = new SocketClassAdapterImpl();
		Volts v3 = getVolts(socketAdapter, 3);
		Volts v12 = getVolts(socketAdapter, 12);
		Volts v120 = getVolts(socketAdapter, 120);
		System.out.println("3 volts using object adapter: "+v3.getVolts());
		System.out.println("12 volts using object adapter: "+v12.getVolts());
		System.out.println("120 volts using object adapter: "+v120.getVolts());
		
	}

}
