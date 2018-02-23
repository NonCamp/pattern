package com.zmy.pattern.command;

public class ConcreteCommand extends Command{

	@Override
	public void execute() {
		receiver.action();
	}

}
