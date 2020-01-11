package com.designpattern.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {
	
	private Socket socket = new Socket();

	@Override
	public Volts get120Volts() {
		return socket.getVolts();
	}

	@Override
	public Volts get12Volts() {
		Volts v = socket.getVolts();
		return converVolts(v, 10);
	}

	@Override
	public Volts get3Volts() {
		Volts v = socket.getVolts();
		return converVolts(v, 40);
	}
	
	private Volts converVolts(Volts v, int i) {
		return new Volts(v.getVolts()/i);
	}
	

}
