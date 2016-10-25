package com.amen.solid.d_1.bad;

public class GUIInterfaceButton {

	public GUIInterfaceButton() {
	}
	
	public void clicked(UserEmail email){
		// WRONG! executing action directly on data
		email.send();
	}
}
