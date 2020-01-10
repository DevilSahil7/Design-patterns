package com.designpattern.factory.test;

import com.designpattern.factory.model.Computer;
import com.designpattern.factory.operation.ComputerFactory;
import com.designpattern.factory.operation.ComputerType;

public class ComputerClient {

	public static void main(String[] args) {
		Computer Pc = ComputerFactory.createComputer(ComputerType.PC, "4 GB", "256 GB", "2.4 GHz");
		System.out.println(Pc);
		Computer Server = ComputerFactory.createComputer(ComputerType.SERVER, "16 GB", "1 TB", "2.9 GHz");
		System.out.println(Server);
		Computer SuperComputer = ComputerFactory.createComputer(ComputerType.SUPERCOMPUTER, "16 GB", "2 TB", "3.4 GHz");
		System.out.println(SuperComputer);

	}

}
