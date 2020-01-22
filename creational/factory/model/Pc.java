package com.designpattern.factory.model;

public class Pc implements Computer {
	private String RAM;
	private String HDD;	
	private String CPU;
	
	public Pc(String ram, String hdd, String cpu) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}
	
	@Override
	public String getRAM() {
		return this.RAM;
	}
	@Override
	public String getHDD() {
		return this.HDD;
	}
	@Override
	public String getCPU() {
		return this.CPU;
	}

	@Override
	public String toString() {
		return "Pc [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}
	
	

}
