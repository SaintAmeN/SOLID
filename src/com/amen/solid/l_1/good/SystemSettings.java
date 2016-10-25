package com.amen.solid.l_1.good;

public class SystemSettings implements ILoadableSettings{

	@Override
	public void load() {
		System.out.println("Some System settings are loaded.");
	}
}
