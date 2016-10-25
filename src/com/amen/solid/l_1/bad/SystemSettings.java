package com.amen.solid.l_1.bad;

public class SystemSettings implements ISettings {

	@Override
	public void load() {
		System.out.println("Some System settings are loaded.");
	}
	
	@Override
	public void save() {
		// WRONG!
		// NOT IMPLEMENTING METHOD IS NOT BETTER
		throw new UnsupportedOperationException();
	};
	
}
