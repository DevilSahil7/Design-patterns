package com.designpattern.singletonpattern;

public class Enum {

	public static void main(String[] args) {
		abc obj = abc.INSTANCE;
		obj.i = 7;
		obj.show();
		
		abc obj1 = abc.INSTANCE;
		obj1.i = 9;
		obj.show();

	}

}

enum abc{
	INSTANCE;
	int i;
	public void show() {
		System.out.println(i);
	}
}