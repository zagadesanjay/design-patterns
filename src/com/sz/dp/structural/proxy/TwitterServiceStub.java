package com.sz.dp.structural.proxy;

public class TwitterServiceStub implements TwitterService {

	@Override
	public String getTimeLine(String screenName) {
		return "My Timeline";
	}

	@Override
	public void postToTimeLine(String screenName, String message) {
	}

}
