package com.zmy.pattern.command;

public class Invoker {
	protected Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand(){
		command.execute();
	}
	
}
