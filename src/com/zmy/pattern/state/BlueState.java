package com.zmy.pattern.state;

public class BlueState implements State{

	@Override
	public void last(Context c) {
		c.setState(new RedState());
	}

	@Override
	public void next(Context c) {
		c.setState(new GreenState());
	}

	@Override
	public String getState() {
		return "blue";
	}

}
