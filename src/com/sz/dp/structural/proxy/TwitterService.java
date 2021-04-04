package com.sz.dp.structural.proxy;

public interface TwitterService {

	public String getTimeLine(String screenName);
	public void postToTimeLine(String screenName, String message);
}
