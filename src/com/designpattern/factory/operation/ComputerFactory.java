package com.designpattern.factory.operation;

import com.designpattern.factory.model.Computer;
import com.designpattern.factory.model.Pc;
import com.designpattern.factory.model.Server;
import com.designpattern.factory.model.SuperComputer;

public class ComputerFactory {
	
	public static Computer createComputer(ComputerType type, String ram, String hdd, String cpu) {
		Computer computer = null;
		switch(type) {
		case PC :
			computer = new Pc(ram, hdd, cpu);
			break;
		case SERVER:
			computer = new Server(ram, hdd, cpu);
			break;
		case SUPERCOMPUTER:
			computer = new SuperComputer(ram, hdd, cpu);
			break;
		}
		return computer;
	}

}
