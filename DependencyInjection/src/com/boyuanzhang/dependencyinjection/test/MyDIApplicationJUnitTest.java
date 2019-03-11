package com.boyuanzhang.dependencyinjection.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.boyuanzhang.dependencyinjection.consumer.Consumer;
import com.boyuanzhang.dependencyinjection.consumer.MyDIApplication;
import com.boyuanzhang.dependencyinjection.injector.MessageServiceInjector;
import com.boyuanzhang.dependencyinjection.service.MessageService;

public class MyDIApplicationJUnitTest {

	private MessageServiceInjector injector;

	@Before
	public void setUp() {
		// mock the injector with anonymous class
		injector = new MessageServiceInjector() {

			@Override
			public Consumer getConsumer() {
				// mock the message service
				return new MyDIApplication(new MessageService() {

					@Override
					public void sendMessage(String msg, String rec) {
						System.out.println("Mock Message Service implementation");

					}
				});
			}
		};
	}

	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessages("Hi Boyuan", "boyuan@abc.com");
	}

	@After
	public void tear() {
		injector = null;
	}

}
