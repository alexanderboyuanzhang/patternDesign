package com.boyuanzhang.dependencyinjection.consumer;

public interface Consumer {
	void processMessages(String messageStr, String receiverStr);
}
