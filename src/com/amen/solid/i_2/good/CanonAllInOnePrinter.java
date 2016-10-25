package com.amen.solid.i_2.good;

import com.amen.solid.i_2.Document;

public class CanonAllInOnePrinter implements ICopier, IFax, IPrinter, IScanner, IMailer{

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
