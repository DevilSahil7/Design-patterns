package com.designpattern.observer;

public class Subscriber {

	private String name;
	private Channel channel = new Channel();
	
	
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	public void update() {
		System.out.println("Hey "+name+", video uploaded: "+channel.title);
	}
	
	public void subscribeChannel(Channel ch) {
		channel = ch;
	}
}
