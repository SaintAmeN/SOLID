package com.amen.solid.i_1.bad;

public class Robot implements IWorker {
	@Override
	public void eat() {
		// WRONG ! ROBOT DOES NOT NEED TO EAT
		throw new UnsupportedOperationException();
	}

	@Override
	public void work() {
	}
}
