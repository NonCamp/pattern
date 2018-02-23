package com.zmy.pattern.command;

public abstract class Command {
	protected Receiver receiver;
	
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	public abstract void execute();
}
