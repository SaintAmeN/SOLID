package com.amen.solid.d_2.good;

public class Main {

	public static void main(String[] args) {
		Notification notification = new Notification();
	
		notification.addMessage(new Email("pawel.reclaw@gmail.com", "Subject", "Some content"));
		notification.addMessage(new SMSMessage("123456789", "Content"));
		
		notification.send();
	}
}
