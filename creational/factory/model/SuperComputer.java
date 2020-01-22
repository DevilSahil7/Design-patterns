package com.designpattern.factory.model;

public class SuperComputer implements Computer {

	private String RAM;
	private String HDD;
	private String CPU;
	
	public SuperComputer(String ram, String hdd, String cpu) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}
	@Override
	public String getRAM() {
		return null;
	}

	@Override
	public String getHDD() {
		return null;
	}

	@Override
	public String getCPU() {
		return null;
	}
	@Override
	public String toString() {
		return "SuperComputer [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}

	
}
