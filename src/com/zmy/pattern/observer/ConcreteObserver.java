package com.zmy.pattern.observer;

public class ConcreteObserver extends Observer{
	private String observerState;
	private String name;
	public ConcreteObserver(String name) {
		this.name = name;
		System.out.println("生成观察者" + name);
	}
	@Override
	public void update(String state) {
		observerState = state;
		System.out.println("观察者"+name+"的状态：" + observerState);
	}

}
