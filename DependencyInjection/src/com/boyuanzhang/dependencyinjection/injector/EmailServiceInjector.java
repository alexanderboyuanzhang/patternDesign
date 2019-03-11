package com.boyuanzhang.dependencyinjection.injector;

import com.boyuanzhang.dependencyinjection.consumer.Consumer;
import com.boyuanzhang.dependencyinjection.consumer.MyDIApplication;
import com.boyuanzhang.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new EmailServiceImpl());
	}
}
