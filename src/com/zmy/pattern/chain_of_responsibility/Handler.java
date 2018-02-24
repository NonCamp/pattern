package com.zmy.pattern.chain_of_responsibility;

public abstract class Handler {
	protected Handler handler;

	public Handler getHandler() {
		return handler;
	}
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	public abstract void handleRequest();
	
}
