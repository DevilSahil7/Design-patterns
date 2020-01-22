package com.designpattern.adapter;

public class Socket {

	public Volts getVolts() {
		return new Volts(120);
	}
}
