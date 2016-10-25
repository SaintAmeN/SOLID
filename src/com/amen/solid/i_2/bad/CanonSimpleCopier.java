package com.amen.solid.i_2.bad;

import com.amen.solid.i_2.Document;

public class CanonSimpleCopier implements IMachine{

	@Override
	public Document copy(Document doc) {
		return null;
	}
	
	@Override
	public void email(Document doc) {
		// ERROR
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void fax(Document doc) {
		// ERROR
		throw new UnsupportedOperationException();
	}
	
	@Override
	public Document scan() {
		// ERROR
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void print(Document doc) {	
		// ERROR
		throw new UnsupportedOperationException();	
	}
}
