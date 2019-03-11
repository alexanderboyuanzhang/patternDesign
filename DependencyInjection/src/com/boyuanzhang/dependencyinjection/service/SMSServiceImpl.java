package com.boyuanzhang.dependencyinjection.service;

public class SMSServiceImpl implements MessageService {

	@Override
	public void sendMessage(String messageStr, String receiverStr) {
		// logic to send SMS
		System.out.println("SMS sent to " + receiverStr + " with Message=" + messageStr);
	}

}
