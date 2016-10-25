package com.amen.solid.l_1.good;

import java.util.LinkedList;
import java.util.List;

/**
 * Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.
 * 
 * @author AmeN
 */
public class SettingsManager {

	private List<ILoadableSettings> loadableSettings;
	private List<ISaveableSettings> saveableSettings;
	
	public SettingsManager() {
		loadableSettings = new LinkedList<>();
		saveableSettings = new LinkedList<>();
	}
	
	public void loadAllSettings(){
		for(ILoadableSettings setting : loadableSettings){
			setting.load();
		}
	}
	
	public void saveAllSettings(){
		for(ISaveableSettings setting : saveableSettings){
			setting.save();
		}
	}
}
