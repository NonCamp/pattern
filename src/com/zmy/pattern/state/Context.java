package com.zmy.pattern.state;

public class Context {
	private State state = null;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}  
	

	public void push(){
		state.last(this);
	}
	
	public void pull(){
		state.next(this);
	}
	
	
}
