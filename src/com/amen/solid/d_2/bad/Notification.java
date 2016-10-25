package com.amen.solid.d_2.bad;

public class Notification {
	private Email email;
    private SMSMessage sms;
    
    public Notification()
    {
    	email = new Email("pawel.reclaw@gmail.com", "Subject", "Some content");
    	sms = new SMSMessage("123456789", "Content");
    }

    public void Send()
    {
    	email.sendEmail();
    	sms.send();
    }
}
