package com.zmy.pattern.decorator;

public class ConcreteDecoratorA extends Decorator{

	@Override
	public void operation() {
		super.component.operation();
	}

	@Override
	public void addBehavior() {
		System.out.println("额外行为A...");
	}
	
	

}
