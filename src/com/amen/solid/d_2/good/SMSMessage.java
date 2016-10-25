package com.amen.solid.d_2.good;

public class SMSMessage implements IMessage {

	private String receiverNumber;
	private String content;

	public SMSMessage(String givenNumber, String givenContent) {
		receiverNumber = givenNumber;
		content = givenContent;
	}

	public String getReceiverNumber() {
		return receiverNumber;
	}

	public String getContent() {
		return content;
	}

	@Override
	public void send() {
		// sending
	}
}
