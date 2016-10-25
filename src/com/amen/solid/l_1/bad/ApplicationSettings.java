package com.amen.solid.l_1.bad;

public class ApplicationSettings implements ISettings {

	@Override
	public void load() {
		System.out.println("Some Application settings are loaded.");
	}

	@Override
	public void save() {
		System.out.println("Some Application settings are saved.");
	};
	
}
