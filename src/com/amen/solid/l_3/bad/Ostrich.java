package com.amen.solid.l_3.bad;

public class Ostrich extends Bird {
	@Override
	public void fly() {
		throw new UnsupportedOperationException();
	}
}
