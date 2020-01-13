package com.designpattern.proxy;

import java.util.Calendar;

public class InternetProxy implements ISP {

	public String getResource(String site) {
		this.logRequest(site);
		if (this.isblocked(site)) {
			return "This site is blocked as per company policy";
		}
		NetworkSetting networkSetting = new NetworkSetting();
		return networkSetting.getISP().getResource(site);

	}

	private boolean isblocked(String site) {
		switch (site) {
		case "www.google.com":
			return false;
		case "www.yahoo.com":
			return false;
		default:
			return true;
		}
	}

	private void logRequest(String site) {
		System.out.println(Calendar.getInstance().getTime() + " request for " + site);
	}
}
