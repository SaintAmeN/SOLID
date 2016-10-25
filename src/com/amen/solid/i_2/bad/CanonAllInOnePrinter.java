package com.amen.solid.i_2.bad;

import com.amen.solid.i_2.Document;

public class CanonAllInOnePrinter implements IMachine{

	@Override
	public Document copy(Document doc) {
		return null;
	}
	
	@Override
	public void email(Document doc) {
	}
	
	@Override
	public void fax(Document doc) {
	}
	
	@Override
	public Document scan() {
		return null;
	}
	
	@Override
	public void print(Document doc) {		
	}
}
