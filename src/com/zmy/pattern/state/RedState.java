package com.zmy.pattern.state;

public class RedState implements State{

	@Override
	public void last(Context c) {
		c.setState(new GreenState());
	}

	@Override
	public void next(Context c) {
		c.setState(new BlueState());
	}

	@Override
	public String getState() {
		return "red";
	}

}
