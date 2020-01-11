package com.designpattern.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter {

	@Override
	public Volts get120Volts() {
		return getVolts();
	}

	@Override
	public Volts get12Volts() {
		Volts v = getVolts();
		return convertVolts(v, 10);
	}

	@Override
	public Volts get3Volts() {
		Volts v = getVolts();
		return convertVolts(v, 40);
	}
	
	private Volts convertVolts(Volts v, int i) {
		return new Volts(v.getVolts()/i);
	}

	
}
