package com.zmy.pattern.state;

public class GreenState implements State{

	@Override
	public void last(Context c) {
		c.setState(new BlueState());
	}

	@Override
	public void next(Context c) {
		c.setState(new RedState());
	}

	@Override
	public String getState() {
		return "green";
	}

}
