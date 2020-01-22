package com.designpattern.proxy;

public class NetworkSetting {

	public ISP getInternet() {
		return new InternetProxy();
	}

	public ISP getISP() {
		return new Vodafone();
	}
}
