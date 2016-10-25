package com.amen.solid.d_2.bad;

public class SMSMessage {

	private String receiverNumber;
	private String content;
	
	public SMSMessage(String givenNumber,  String givenContent) {
		receiverNumber = givenNumber;
		content = givenContent;
	}
	
	public String getReceiverNumber() {
		return receiverNumber;
	}
	
	public String getContent() {
		return content;
	}

    public void send() {
    }
}
