package com.zmy.pattern.state;

public interface State {
	public void last(Context c);
	
	public void next(Context c);
	
	public String getState();
}
