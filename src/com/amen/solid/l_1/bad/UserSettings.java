package com.amen.solid.l_1.bad;

public class UserSettings implements ISettings {

	@Override
	public void load() {
		System.out.println("Some User settings are loaded.");
	}

	@Override
	public void save() {
		System.out.println("Some User settings are saved.");
	};
	
}