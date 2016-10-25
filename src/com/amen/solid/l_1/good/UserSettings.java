package com.amen.solid.l_1.good;

public class UserSettings implements ILoadableSettings, ISaveableSettings {

	@Override
	public void load() {
		System.out.println("Some User settings are loaded.");
	}

	@Override
	public void save() {
		System.out.println("Some User settings are saved.");
	};
	
}