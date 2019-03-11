package com.boyuanzhang.dependencyinjection.legacy;

public class EmailService {
	public void sendEmail(String messageStr, String receiverStr) {
		// logic to send email
		System.out.println("Email sent to " + receiverStr + " with Message=" + messageStr);
	}
}
