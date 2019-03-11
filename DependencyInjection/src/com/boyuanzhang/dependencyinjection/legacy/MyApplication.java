package com.boyuanzhang.dependencyinjection.legacy;

public class MyApplication {
	private EmailService emailService = new EmailService();

	public void processMessages(String messageStr, String receiverStr) {
		// do some msg validation, manipulation logic etc
		this.emailService.sendEmail(messageStr, receiverStr);
	}
}