package com.designpattern.proxy;

public class Vodafone implements ISP {

	@Override
	public String getResource(String site) {
		switch (site) {
		case "www.google.com":
			return "Gooogle";
		case "www.yahoo.com":
			return "Yahooooo";
		default:
			return "Sorry no resource found!";
		}
	}
}
