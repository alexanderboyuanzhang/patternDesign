package com.boyuanzhang.dependencyinjection.consumer;

import com.boyuanzhang.dependencyinjection.service.MessageService;

public class MyDIApplication implements Consumer {

	private MessageService service;

	public MyDIApplication(MessageService messageService) {
		this.service = messageService;
	}

	@Override
	public void processMessages(String messageStr, String receiverStr) {
		// do some msg validation, manipulation logic etc
		this.service.sendMessage(messageStr, receiverStr);
	}

}
