package com.amen.solid.d_2.good;

import java.util.LinkedHashSet;

public class Notification {

	private LinkedHashSet<IMessage> messages;

	public Notification() {
		messages = new LinkedHashSet<>();
	}

	public void addMessage(IMessage msg) {
		messages.add(msg);
	}

	public void send() {
		for (IMessage msg : messages) {
			msg.send();
		}
	}
}
