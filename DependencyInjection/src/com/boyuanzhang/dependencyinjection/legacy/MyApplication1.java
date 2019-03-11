package com.boyuanzhang.dependencyinjection.legacy;

public class MyApplication1 {
	private EmailService email = null;

	public MyApplication1(EmailService emailService) {
		this.email = emailService;
	}

	public void processMessages(String messageStr, String receiverStr) {
		// do some msg validation, manipulation logic etc
		this.email.sendEmail(messageStr, receiverStr);
	}
}
