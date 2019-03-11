package com.boyuanzhang.dependencyinjection.service;

public class EmailServiceImpl implements MessageService {

	@Override
	public void sendMessage(String messageStr, String receiverStr) {
		// logic to send email
		System.out.println("Email sent to " + receiverStr + " with Message=" + messageStr);
	}

}
