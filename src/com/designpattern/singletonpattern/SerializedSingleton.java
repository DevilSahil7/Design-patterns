package com.designpattern.singletonpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializedSingleton {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		SerializedSingletonDemo instanceOne = SerializedSingletonDemo.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("uid.ser"));
		out.writeObject(instanceOne);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("uid.ser"));
		SerializedSingletonDemo instanceTwo = (SerializedSingletonDemo) in.readObject();
		in.close();
		System.out.println("instanceOne hashcode: "+instanceOne.hashCode());
		System.out.println("instanceTwo hashcode: "+instanceTwo.hashCode());
	}

}

class SerializedSingletonDemo implements Serializable {
	private static final long serialVersionUID = 764585695L;

	private SerializedSingletonDemo() {
		System.out.println("serialized singleton demo\nserial version uid is" + serialVersionUID);
	}

	private static class SingletonHelper {
		private static final SerializedSingletonDemo instance = new SerializedSingletonDemo();
	}

	public static SerializedSingletonDemo getInstance() {
		return SingletonHelper.instance;
	}
}
