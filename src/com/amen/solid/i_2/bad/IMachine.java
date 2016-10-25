package com.amen.solid.i_2.bad;

import com.amen.solid.i_2.Document;

/**
 * Many client-specific interfaces are better than one general-purpose interface.
 * 
 * @author AmeN
 */
public interface IMachine {

	public void fax(Document doc);
	public void print(Document doc);
	public Document scan();
	public void email(Document doc);
	public Document copy(Document doc);
	
}
