package com.zmy.pattern.decorator;

public class ConcreteDecoratorB extends Decorator{

	@Override
	public void addBehavior() {
		System.out.println("额外操作B...");
	}

	@Override
	public void operation() {
		super.component.operation();
	}

}
