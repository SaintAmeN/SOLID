package com.amen.solid.l_1.good;

public class ApplicationSettings implements ILoadableSettings, ISaveableSettings {

	@Override
	public void load() {
		System.out.println("Some Application settings are loaded.");
	}

	@Override
	public void save() {
		System.out.println("Some Application settings are saved.");
	};
	
}
