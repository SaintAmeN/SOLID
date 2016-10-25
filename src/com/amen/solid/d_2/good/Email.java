package com.amen.solid.d_2.good;

public class Email implements IMessage{

	private String receiverAddess;
	private String subject;
	private String content;
	
	public Email(String givenAddress, String givenSubject, String givenContent) {
		receiverAddess = givenAddress;
		subject = givenSubject;
		content = givenContent;
	}
	
	public String getReceiverAddess() {
		return receiverAddess;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getSubject() {
		return subject;
	}
	
	@Override
	public void send() {
		// sending
	}
}
