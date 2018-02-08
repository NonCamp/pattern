package com.zmy.pattern.proxy;

public class RealSubject implements Subject{

	@Override
	public void doSomething() {
		System.out.println("do something...");
	}

	@Override
	public void output(String name) {
		System.out.println("Hello,"+name);
	}

}
