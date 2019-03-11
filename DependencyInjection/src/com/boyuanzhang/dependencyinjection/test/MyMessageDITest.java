package com.boyuanzhang.dependencyinjection.test;

import com.boyuanzhang.dependencyinjection.consumer.Consumer;
import com.boyuanzhang.dependencyinjection.injector.EmailServiceInjector;
import com.boyuanzhang.dependencyinjection.injector.MessageServiceInjector;
import com.boyuanzhang.dependencyinjection.injector.SMSServiceInjector;

public class MyMessageDITest {
	public static void main(String[] args) {
		String msg = "Hi Boyuan";
		String email = "boyuan@abc.com";
		String phone = "388888888";
		MessageServiceInjector injector = null;
		Consumer app = null;

		// Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);

		// Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}
