package com.amen.solid.d_1.good;

public class GUIInterfaceButton {

	public GUIInterfaceButton() {
	}
	
	public void clicked(ISendable email){
		// GOOD, executing on interface as another layer of abstraction
		email.send();
	}
}
