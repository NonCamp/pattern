package com.zmy.pattern.command;

public class Test {

	public static void main(String[] args) {
		// 调用者
		Invoker invoker = new Invoker();
		// 生成命令
		Command command = new ConcreteCommand();
		// 接受者
		Receiver receiver = new Receiver();
		// 设置命令
		invoker.setCommand(command);
		// 设置命令的接受者
		command.setReceiver(receiver);
		// 执行命令
		invoker.executeCommand();
	}

}
