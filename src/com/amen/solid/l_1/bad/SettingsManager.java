package com.amen.solid.l_1.bad;

import java.util.LinkedList;
import java.util.List;

public class SettingsManager {

	private List<ISettings> settings;
	
	public SettingsManager() {
		settings = new LinkedList<ISettings>();
	}
	
	public void loadAllSettings(){
		for(ISettings setting : settings){
			setting.load();
		}
	}
	
	public void saveAllSettings(){
		for(ISettings setting : settings){
			// WRONG!
			if(!(setting instanceof SystemSettings)){
				continue;
			}
			setting.save();
		}
	}
}
