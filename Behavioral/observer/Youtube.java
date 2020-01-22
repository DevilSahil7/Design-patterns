package com.designpattern.observer;

public class Youtube {

	public static void main(String[] args) {
		
		Channel java = new Channel();
		
		Subscriber s1 = new Subscriber("Sahil");
		Subscriber s2 = new Subscriber("Anagha");
		Subscriber s3 = new Subscriber("Amit");
		Subscriber s4 = new Subscriber("Jordan");
		Subscriber s5 = new Subscriber("Lisa");
		Subscriber s6 = new Subscriber("Rosy");
		
		java.subscribe(s1);
		java.subscribe(s2);
		java.subscribe(s3);
		java.subscribe(s4);
		java.subscribe(s5);
		java.subscribe(s6);
		
		java.unSubscribe(s3);
		
		s1.subscribeChannel(java);
		s2.subscribeChannel(java);
		s3.subscribeChannel(java);
		s4.subscribeChannel(java);
		s5.subscribeChannel(java);
		s6.subscribeChannel(java);
		
		
		java.upload("How to do programming in java");
	}

}
