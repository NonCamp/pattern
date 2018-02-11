package com.zmy.pattern.observer;

public class Test {
	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Observer observer1 = new ConcreteObserver("A");
		subject.attach(observer1);
		Observer observer2 = new ConcreteObserver("B");
		subject.attach(observer2);
		subject.change("newState");
		
	}
}
