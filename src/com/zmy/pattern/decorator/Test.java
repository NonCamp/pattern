package com.zmy.pattern.decorator;

public class Test {
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		
		Decorator decorator1 = new ConcreteDecoratorA();
		Decorator decorator2 = new ConcreteDecoratorB();
		
		decorator1.setComponent(component);
		decorator2.setComponent(component);
		
		decorator1.operation();
		decorator1.addBehavior();
		
	}
}
